import com.typesafe.sbt.SbtGit.GitKeys
import com.typesafe.sbt.git.DefaultReadableGit

name := "PragmaticScala"

version := "1.0"

scalaVersion := "2.12.4"

resolvers += "akka" at "https://dl.bintray.com/akka/maven/"

enablePlugins(ParadoxSitePlugin)

enablePlugins(AkkaParadoxPlugin)

enablePlugins(GhpagesPlugin)

git.remoteRepo := "https://github.com/ReactivePlatform/Pragmatic-Scala.git"

GitKeys.gitReader in ThisProject := baseDirectory(base => new DefaultReadableGit(base)).value

excludeFilter in ghpagesCleanSite :=
  new FileFilter{
    def accept(f: File) = (ghpagesRepository.value / "CNAME").getCanonicalPath == f.getCanonicalPath
  } || "versions.html"