name := "scala-openshift"

version := "0.1"

scalaVersion := "2.12.4"

mainClass in (Compile, run) := Some("io.radanalytics.weatherData.weatherTree")

libraryDependencies += "com.github.haifengl" %% "smile-scala" % "1.5.0"

libraryDependencies += "com.github.haifengl" % "smile-core" % "1.5.0"

libraryDependencies += "com.github.haifengl" % "smile-interpolation" % "1.5.0"

libraryDependencies += "com.github.haifengl" % "smile-nlp" % "1.5.0"

libraryDependencies += "com.github.haifengl" % "smile-plot" % "1.5.0"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.12.4"
