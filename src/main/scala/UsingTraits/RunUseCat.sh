#!/usr/bin/env bash

export binDir=`pwd`/bin
mkdir -p $binDir
export replacestring="s/\([a-zA-Z0-9\/]*\)\(UseCat\)/\2/"
scalac -d $binDir Friend.scala Animal.scala Cat.scala
scalac -classpath $binDir UseCat.scala | sed $replacestring | fold -w 75 -s