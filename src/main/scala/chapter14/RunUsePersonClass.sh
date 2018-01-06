#!/usr/bin/env bash

./compileAndCreateJar.sh
// #snip_1
mkdir -p classes
scalac -d classes -classpath /tmp/example.jar UsePersonClass.scala
// #snip_1

// #snip_2
scala -classpath classes:/tmp/example.jar UsePersonClass
// #snip_2
