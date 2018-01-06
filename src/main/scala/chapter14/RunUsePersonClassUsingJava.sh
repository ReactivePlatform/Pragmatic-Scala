#!/usr/bin/env bash

./compileAndCreateJar.sh
mkdir -p classes
scalac -d classes -classpath /tmp/example.jar UsePersonClass.scala
// #snip
java -classpath $SCALA_HOME/lib/scala-library.jar:classes:/tmp/example.jar \
  UsePersonClass
// #snip