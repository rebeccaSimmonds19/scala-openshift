name := "scala-openshift"

version := "0.1"

scalaVersion := "2.11.8"

mainClass in (Compile, run) := Some("io.radanalytics.weatherData.weatherTree")

resourceDirectory in Compile := baseDirectory.value / "resources.io.radanalytics.weatherData.data"

libraryDependencies += "com.github.haifengl" %% "smile-scala" % "1.2.1"

libraryDependencies += "com.github.haifengl" % "smile-core" % "1.2.1"

// https://mvnrepository.com/artifact/com.github.haifengl/smile-interpolation
libraryDependencies += "com.github.haifengl" % "smile-interpolation" % "1.2.1"

libraryDependencies += "com.github.haifengl" % "smile-nlp" % "1.2.1"

// https://mvnrepository.com/artifact/com.github.haifengl/smile-plot
libraryDependencies += "com.github.haifengl" % "smile-plot" % "1.2.1"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"
