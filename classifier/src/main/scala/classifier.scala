import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object Classifier {
        def main(args: Array[String]) {
                val conf = new SparkConf().setAppName("PatentPagerank")
                val sc = new SparkContext(conf)

                val data = MLUtils.loadLibSVMFile(sc, "/data/patents/twitter/sample_libsvm_data.txt")

                val splits = data.randomSplit(Array(0.6, 0.4), seed = 11L)
                val training = splits(0).cache()
                val test = splits(1)

                val numIterations = 100
                val model = SVMWithSGD.train(training, numIterations)

                model.clearThreshold()

                val scoreAndLabels = test.map { point =>
                        val score = model.predict(point.features)
                        (score, point.label)
                }

                val metrics = new BinaryClassificationMetrics(scoreAndLabels)
                val auROC = metrics.areaUnderROC()

                println("Area under ROC = " + auROC)

                model.save(sc, "/data/patents/twitter")
        }
}
