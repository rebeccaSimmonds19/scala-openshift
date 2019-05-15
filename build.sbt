name := "scala-openshift"

version := "0.1"

scalaVersion := "2.11.8"

mainClass in (Compile, run) := Some("io.radanalytics.weatherData.weatherTree")

resourceDirectory in Compile := baseDirectory.value / "resources.io.radanalytics.weatherData.data"

libraryDependencies += "com.github.haifengl" %% "smile-scala" % "1.5.2"

libraryDependencies += "com.github.haifengl" % "smile-core" % "1.5.2"

libraryDependencies += "com.github.haifengl" % "smile-data" % "1.5.2"

libraryDependencies += "com.github.haifengl" % "smile-math" % "1.5.2"

libraryDependencies += "com.github.haifengl" % "smile-graph" % "1.5.2"

// https://mvnrepository.com/artifact/com.github.haifengl/smile-interpolation
libraryDependencies += "com.github.haifengl" % "smile-interpolation" % "1.5.2"

// https://mvnrepository.com/artifact/com.github.haifengl/smile-nlp
libraryDependencies += "com.github.haifengl" % "smile-nlp" % "1.5.2"

// https://mvnrepository.com/artifact/com.github.haifengl/smile-plot
libraryDependencies += "com.github.haifengl" % "smile-plot" % "1.5.2"

// https://mvnrepository.com/artifact/com.thoughtworks.xstream/xstream
libraryDependencies += "com.thoughtworks.xstream" % "xstream" % "1.4.11.1"
