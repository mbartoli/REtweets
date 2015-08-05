package dose.tools
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

import org.apache.spark.mllib._
import org.apache.spark.rdd.RDD
import dose.tools._

object MainClass {
  def main(args: Array[String]) = {
    println("calling")
    val sparkConfigs = tweetProcessing.setupSparkProject(args)
  }
}