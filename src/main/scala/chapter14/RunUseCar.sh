#!/usr/bin/env bash

mkdir -p classes
scalac -d classes Car.scala
javac -d classes -classpath $SCALA_HOME/lib/scala-library.jar:classes \
  UseCar.java
java -classpath $SCALA_HOME/lib/scala-library.jar:classes \
  automobiles.users.UseCar
