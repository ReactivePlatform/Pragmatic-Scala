#!/usr/bin/env bash

export binDir=`pwd`/bin
scalac -d $binDir Friend.scala Animal.scala Cat.scala
scala -classpath $binDir TreatCatAsFriend.scala