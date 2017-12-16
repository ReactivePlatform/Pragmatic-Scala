#!/usr/bin/env bash

mkdir -p classes
scalac -d classes Printable.scala
echo "
javap classes/Printable.class classes/Printable\$class.class
echo "
echo "
echo "
javac -d classes -classpath $SCALA_HOME/lib/scala-library.jar:classes \
  APrintable.java
java -classpath $SCALA_HOME/lib/scala-library.jar:classes APrintable
echo "
echo "