#!/usr/bin/env bash

mkdir -p classes

// #snip
scalac -d classes -classpath $SCALA_TEST_JAR \
  WordScorer.scala WordScorerTest.scala
scala -classpath $SCALA_TEST_JAR:classes org.scalatest.run WordScorerTest
// #snip
