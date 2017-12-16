#!/usr/bin/env bash

./compileAndCreateJar.sh
scala -classpath /tmp/example.jar usePerson.scala
