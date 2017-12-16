#!/usr/bin/env bash

mkdir -p classes
scalac -d classes HollywoodActor4.scala UseActor.scala
scala -classpath classes UseActor
