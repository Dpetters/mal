lazy val root = (project in file(".")).
  settings(
    name := "mal",
    version := "0.1",
    scalaVersion := "3.1.0"
  )

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.0"