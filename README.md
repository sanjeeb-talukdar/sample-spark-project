
Sample Spark Project
====================

[Spark][1] is an excellent engine for large-scale data processing. 
Getting started with it, however, may be somewhat painful because 
of incompatible versions, variety of options for building and 
running applications, etc. This is a simple Spark/Scala application providing 
basic working setup. This setup includes: 

 - SBT
   - assembly plugin for building uberjars
   - build script with Spark 1.0 and custom Hadoop client
 - sample Scala program in `src/main/scala/pack/Main.scala`
 - short `run` script demonstrating how to submit application to cluster

Code is purposely simplistic and designed for reading.


Running Sample Application
--------------------------

`run` script relies on following assumptions: 

 - you have Spark installed and running locally in standalone mode; 
   if you want to run sample app against cluster or with other resource manager,
   modify SPARK_MASTER variable in `run` script
 - Spark's `bin` directory is on your system `PATH`; this is needed 
   to call `spark-submit` command

Having this, you can build and launch sample app by calling 

    ./run -r 

from the top level of sample-spark-project. Note, that `-r` option is 
needed only to re-assemble uberjar. If a code was not modified, you can skip it: 

    ./run



[1]: http://spark.apache.org/


