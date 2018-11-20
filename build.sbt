
name := "spotifyApp"
 
version := "1.0"

lazy val `spotifyapp` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq("org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2", "org.scalatest" %% "scalatest" % "3.0.5", jdbc , ehcache , ws , specs2 % Test , guice )




      