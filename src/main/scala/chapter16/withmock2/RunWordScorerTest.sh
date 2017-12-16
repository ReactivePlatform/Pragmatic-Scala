#!/usr/bin/env bash

mkdir -p classes
scalac -d classes -classpath $SCALA_TEST_JAR:$MOCKITO_JAR \
  WordScorer.scala SpellChecker.scala WordScorerTest.scala
scala -classpath $SCALA_TEST_JAR::$MOCKITO_JAR:classes \
  org.scalatest.run WordScorerTest
