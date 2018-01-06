#!/usr/bin/env bash

// #snip_1
mkdir -p classes
scalac -d classes Printable.scala
// #snip_1

// #snip_2
javap classes/Printable.class classes/Printable\$class.class
// #snip_2

// #snip_3
javac -d classes -classpath $SCALA_HOME/lib/scala-library.jar:classes \
  APrintable.java
java -classpath $SCALA_HOME/lib/scala-library.jar:classes APrintable
// #snip_3
