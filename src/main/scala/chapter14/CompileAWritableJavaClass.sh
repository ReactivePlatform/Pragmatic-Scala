#!/usr/bin/env bash

mkdir -p classes
scalac -d classes Writable.scala
javac -classpath $SCALA_HOME/lib/scala-library.jar:classes AWritableJavaClass.java