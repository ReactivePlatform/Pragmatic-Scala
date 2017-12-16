#!/usr/bin/env bash

scalac -d bin Tax.scala
scala -classpath `pwd`/bin CatchAll.scala 2>&1 | head -5
