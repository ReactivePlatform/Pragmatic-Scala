#!/usr/bin/env bash

./compileAndCreateJar.sh
mkdir -p classes
scalac -d classes -classpath /tmp/example.jar UsePersonClass.scala
scala -classpath classes:/tmp/example.jar UsePersonClass
