#!/usr/bin/env bash

mkdir -p classes
scalac -d classes HollywoodActor2.scala CreateActors2.scala
scala -classpath classes CreateActors
