#!/usr/bin/env bash

mkdir -p classes
// #snip
scalac -d classes HollywoodActor.scala CreateActors.scala
// #snip

// #snip-run
scala -classpath classes CreateActors
// #snip-run
