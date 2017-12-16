#!/usr/bin/env bash

scalac -d bin TypeInference.scala
javap -classpath bin -private TypeInference
