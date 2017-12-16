#!/usr/bin/env bash

scalac -d bin Tax.scala
scala -classpath `pwd`/bin ExceptionHandling.scala 2>&1 | head -5
echo '...'