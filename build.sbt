name := "PragmaticScala"

version := "1.0.0"

scalaVersion := "2.13.1"

scalacOptions in Compile ++= Seq("-encoding", "UTF-8", "-target:jvm-1.8", "-feature", "-unchecked", "-Xlog-reflective-calls", "-Xlint")

javacOptions in compile ++= Seq("-encoding", "UTF-8", "-source", "1.8", "-target", "1.8", "-Xlint:unchecked", "-XDignore.symbol.file")

resolvers += "akka" at "https://dl.bintray.com/akka/maven/"

//javaFormattingSettingsFilename in ThisBuild := "formatting-java.xml"

//sourceLevel in ThisBuild := Some("1.8")
//
//targetLevel in ThisBuild := Some("1.8")

enablePlugins(ParadoxSitePlugin)

enablePlugins(GhpagesPlugin)

enablePlugins(AutomateHeaderPlugin)

enablePlugins(JavaFormatterPlugin)

(sources in Test) := Nil

scmInfo := Some(ScmInfo(url(
  "https://github.com/ReactivePlatform/Pragmatic-Scala.git"),
  "git@github.com:ReactivePlatform/Pragmatic-Scala.git"))

git.remoteRepo := scmInfo.value.get.connection

excludeFilter in ghpagesCleanSite :=
  new FileFilter {
    def accept(f: File) = (ghpagesRepository.value / "CNAME").getCanonicalPath == f.getCanonicalPath
  } || "versions.html"

enablePlugins(ParadoxMaterialThemePlugin)

ParadoxMaterialThemePlugin.paradoxMaterialThemeSettings(Paradox)


paradoxProperties in Compile ++= Map(
  "project.name" -> "Pragmatic-Scala",
  "github.base_url" -> "https://github.com/ReactivePlatform/Pragmatic-Scala"
)

paradoxMaterialTheme in Compile ~= {
  _.withColor("red", "pink")
    .withLogoIcon("cloud")
    .withCopyright("Copyleft © 2018 pragmatic-scala.reactiveplatform.xyz")
    .withRepository(uri("https://github.com/ReactivePlatform/Pragmatic-Scala.git"))
    .withSearch(tokenizer = "[\\s\\-\\.]+")
    .withSocial(
      uri("https://github.com/hepin1989")
    )
}

organizationName := "pragmatic-scala.reactiveplatform.xyz"
startYear := Some(2018)
licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.3.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "0.2.0"
//
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8"
libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "org.mockito" % "mockito-core" % "3.5.0"

//如果想要写更好的代码：）
//wartremoverErrors ++= Warts.all

addCompilerPlugin(scalafixSemanticdb)