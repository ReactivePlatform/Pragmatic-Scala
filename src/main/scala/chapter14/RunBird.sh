#!/usr/bin/env bash

mkdir -p classes
scalac -d classes Bird.scala NoFlyException.scala Ostrich.scala
javac -d classes -classpath $SCALA_HOME/lib/scala-library.jar:classes Penguin.java 2>&1 | head -5
