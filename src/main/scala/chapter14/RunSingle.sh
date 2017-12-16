#!/usr/bin/env bash

mkdir -p classes
scalac -d classes Single.scala
javac -d classes -classpath $SCALA_HOME/lib/scala-library.jar:classes SingleUser.java
java -classpath $SCALA_HOME/lib/scala-library.jar:classes SingleUser
