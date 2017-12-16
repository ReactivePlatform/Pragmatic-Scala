#!/usr/bin/env bash

head -14 Person.scala > /tmp/Person.scala
scalac -d bin /tmp/Person.scala
javap -classpath bin -private Person | grep position
