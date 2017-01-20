lazy val root = (project in file(".")).
  settings(
    name := "example-ho-spark-scala-ds-excelout",
    version := "0.1"
  )

crossScalaVersions := Seq("2.10.5", "2.11.7")

scalacOptions += "-target:jvm-1.7"

resolvers += Resolver.mavenLocal

assemblyJarName in assembly := "example-ho-spark-scala-ds-excelout.jar"

libraryDependencies += "com.github.zuinnote" %% "spark-hadoopoffice-ds" % "1.0.1" % "compile"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0" % "provided"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.0" % "provided"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
