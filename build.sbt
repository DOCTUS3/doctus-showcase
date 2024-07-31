ThisBuild / scalaVersion := "2.13.14"
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

lazy val javaVersion = "17" // Info for scalac in order to optimise
lazy val utestVersion = "0.8.3"
lazy val scalaJsJqueryVersion = "1.0.0"
lazy val doctusVersion = "2.0.0-SNAPSHOT"
lazy val organisation = "net.entelijan"

lazy val doctusShowcase = crossProject(JSPlatform, JVMPlatform).
  in(file(".")).
  settings(
    name := "doctus-showcase", 
    organization := organisation,
    version := doctusVersion,
    testFrameworks += new TestFramework("utest.runner.Framework"),
    scalacOptions ++= Seq(
      "-deprecation",
      "-Wunused",
    ),
  ).
  jvmSettings(
    libraryDependencies += organisation %% "doctus-core" % doctusVersion,
    fork := true,
    libraryDependencies += "com.lihaoyi" %% "utest" % utestVersion % "test",
  ).
  jsSettings(
    libraryDependencies += organisation %%% "doctus-core" % doctusVersion,
    libraryDependencies += "com.lihaoyi" %%% "utest" % utestVersion % "test",
  )
