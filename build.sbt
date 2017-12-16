import com.typesafe.sbt.SbtGit.GitKeys
import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import com.typesafe.sbt.git.DefaultReadableGit

import scalariform.formatter.preferences._

name := "PragmaticScala"

version := "1.0"

scalaVersion := "2.12.4"

resolvers += "akka" at "https://dl.bintray.com/akka/maven/"

enablePlugins(ParadoxSitePlugin)

enablePlugins(GhpagesPlugin)

git.remoteRepo := "https://github.com/ReactivePlatform/Pragmatic-Scala.git"

GitKeys.gitReader in ThisProject := baseDirectory(base => new DefaultReadableGit(base)).value

excludeFilter in ghpagesCleanSite :=
  new FileFilter{
    def accept(f: File) = (ghpagesRepository.value / "CNAME").getCanonicalPath == f.getCanonicalPath
  } || "versions.html"

enablePlugins(ParadoxMaterialThemePlugin)

ParadoxMaterialThemePlugin.paradoxMaterialThemeSettings(Paradox)

paradoxMaterialTheme in Compile := {
  ParadoxMaterialTheme()
    .withColor("red", "pink")
    .withLogoIcon("cloud")
    .withCopyright("Copyleft © 2017")
}


organizationName := "pragmatic-scala.reactiveplatform.xyz"
startYear := Some(2017)
licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))

def setPreferences(preferences: IFormattingPreferences): IFormattingPreferences = preferences
  .setPreference(RewriteArrowSymbols, true)
  .setPreference(AlignParameters, true)
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentConstructorArguments, false)
  .setPreference(DoubleIndentMethodDeclaration, false)
  .setPreference(DanglingCloseParenthesis, Preserve)
  .setPreference(NewlineAtEndOfFile, true)

ScalariformKeys.preferences := setPreferences(ScalariformKeys.preferences.value)
ScalariformKeys.preferences in Compile := setPreferences(ScalariformKeys.preferences.value)
ScalariformKeys.preferences in Test := setPreferences(ScalariformKeys.preferences.value)