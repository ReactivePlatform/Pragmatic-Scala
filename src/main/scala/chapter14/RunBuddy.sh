#!/usr/bin/env bash

mkdir -p classes
scalac -d classes Buddy.scala
javac -d classes -classpath $SCALA_HOME/lib/scala-library.jar:classes BuddyUser.java
java -classpath $SCALA_HOME/lib/scala-library.jar:classes BuddyUser
