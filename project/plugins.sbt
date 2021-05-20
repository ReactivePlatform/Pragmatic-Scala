resolvers += "Bintray Jcenter" at "https://jcenter.bintray.com/"

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.3")

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.6.6")

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-theme" % "0.6.6")

addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.6.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.6.0")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.28")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.0")

addSbtPlugin("com.dwijnand" % "sbt-reloadquick" % "1.0.0")

addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.4.4")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.2")
