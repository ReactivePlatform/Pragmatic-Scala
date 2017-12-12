name := "PragmaticScala"

version := "1.0"

scalaVersion := "2.12.4"

resolvers += "akka" at "https://dl.bintray.com/akka/maven/"

enablePlugins(ParadoxSitePlugin)

enablePlugins(AkkaParadoxPlugin)

enablePlugins(GhpagesPlugin)

scmInfo := Some(ScmInfo(
  url("https://github.com/ReactivePlatform/Pragmatic-Scala"),
  "git@github.com:ReactivePlatform/Pragmatic-Scala.git"))

enablePlugins(GhpagesPlugin)

git.remoteRepo := scmInfo.value.get.connection