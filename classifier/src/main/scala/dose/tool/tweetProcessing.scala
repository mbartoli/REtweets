import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

import org.apache.spark.mllib._
import org.apache.spark.rdd.RDD
import bbdl.space._
package dose.tool
object project {
        def setupSparkProject(args: Array[String]) {
                val conf = new SparkConf().setAppName("REtweets")
                val sc = new SparkContext(conf)
                (conf, sc)
        }
}
