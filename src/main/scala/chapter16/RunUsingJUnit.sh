#!/usr/bin/env bash

mkdir -p classes
scalac -d classes -classpath $JUNIT_JAR:$HAMCREST_JAR UsingJUnit.scala
java -classpath $SCALALIBRARY:$JUNIT_JAR:$HAMCREST_JAR:classes \
  org.junit.runner.JUnitCore UsingJUnit
