#!/usr/bin/env bash

mkdir -p classes
scalac -d classes HollywoodActor.scala CreateActors.scala
scala -classpath classes CreateActors
