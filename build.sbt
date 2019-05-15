name := "scala-openshift"

version := "0.1"

scalaVersion := "2.11.8"

mainClass in (Compile, run) := Some("io.radanalytics.weatherData.weatherTree")

resourceDirectory in Compile := baseDirectory.value / "resources.io.radanalytics.weatherData.data"

libraryDependencies += "com.github.haifengl" %% "smile-scala" % "1.40"

libraryDependencies += "com.github.haifengl" % "smile-core"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"
