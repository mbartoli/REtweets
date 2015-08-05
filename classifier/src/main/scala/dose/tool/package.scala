import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

import org.apache.spark.mllib._
import org.apache.spark.rdd.RDD
import bbdl.space._
package dose.tool
object Main {
        def main(args: Array[String]) {
                val sparkConfigs = setupSpark(args)
                //TODO val data = importData(args[1])
                //TODO val (training, test) = splitData(genFeatures(data))
                //TODO val models = trainModels(featurizedData)
                //TODO val results = models.map(x => predict(x, genFeatures(test)))
                print("Hello World!")
        }
}
