
package pack

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Main {

  def main(args: Array[String]) {    
    val sparkConf = new SparkConf()      
      // master is passed to spark-submit, but could also be specified explicitely 
      // .setMaster(sparkMaster) 
      .setAppName("The App")
      .set("spark.cores.max", "4")
    val sc = new SparkContext(sparkConf)
    val rdd = sc.parallelize(List(1, 2, 3)).map(x => 2 * x)
    for (el <- rdd.collect()) {
      println(el)
    }
    sc.stop()
  }

}
