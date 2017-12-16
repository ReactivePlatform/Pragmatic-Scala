#!/usr/bin/env bash

mkdir -p classes
scalac -d classes HollywoodActor2.scala CreateActors3.scala
scala -classpath classes CreateActors
