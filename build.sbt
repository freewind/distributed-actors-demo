name := "distributed-actors-demo"

version := "1.0"

scalaVersion := "2.11.7"

resolvers in ThisBuild ++= Seq(
  "akka" at "http://repo.akka.io",
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
)

libraryDependencies in ThisBuild ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.12",
  "com.typesafe.akka" %% "akka-remote" % "2.3.12"
)

lazy val local = project in file("local")

lazy val remote = project in file("remote")
