
import AssemblyKeys._

// activating assembly plugin
assemblySettings  

name := "app"

version := "0.1"

scalaVersion := "2.10.3"

// Cloudera repository is needed for custom version of Hadoop client
resolvers += "Cloudera Repo" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

// custom Hadoop client, configured as provided, since it shouldn't go to assembly jar
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.0.0-cdh4.6.0" % "provided"

// Spark itself, configured as provided, since it shouldn't go to assembly jar
libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.0.0" % "provided"
