name := "TweetClassifier"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.0"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.3.0"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc()
)
