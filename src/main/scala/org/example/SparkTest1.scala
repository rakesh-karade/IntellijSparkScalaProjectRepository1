package main.scala.org.example

import org.apache.spark.sql.SparkSession

object SparkTest1 {

  def main(args : Array[String]) : Unit = {
    val ss = SparkSession.builder().master("local").appName("App-1").getOrCreate()

    val empDF = ss.read.option("header", true).option("inferSchema", true).csv("D:/Spark/Datafiles/emp1.csv")

    empDF.show()
  }


}
