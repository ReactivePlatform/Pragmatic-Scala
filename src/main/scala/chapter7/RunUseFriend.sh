#!/usr/bin/env bash

export binDir=`pwd`/bin
mkdir -p $binDir
scalac -d $binDir Friend.scala Human.scala Animal.scala Dog.scala UseFriend.scala
scala -classpath $binDir UseFriend
