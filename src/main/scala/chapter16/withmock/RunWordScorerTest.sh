#---
# Excerpted from "Pragmatic Scala",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material, 
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose. 
# Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
#---
mkdir -p classes
scalac -d classes -classpath $SCALA_TEST_JAR:$MOCKITO_JAR \
  WordScorer.scala SpellChecker.scala WordScorerTest.scala
scala -classpath $SCALA_TEST_JAR::$MOCKITO_JAR:classes \
  org.scalatest.run WordScorerTest
