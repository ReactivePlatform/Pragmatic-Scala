#!/usr/bin/env bash

// #snip
scalac -d bin TypeInference.scala
javap -classpath bin -private TypeInference
// #snip
