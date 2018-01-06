#!/usr/bin/env bash

./compileAndCreateJar.sh
// #snip
scala -classpath /tmp/example.jar usePerson.scala
// #snip
