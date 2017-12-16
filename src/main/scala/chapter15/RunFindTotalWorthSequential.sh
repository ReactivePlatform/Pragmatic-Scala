#!/usr/bin/env bash

mkdir -p classes
scalac -deprecation -d classes StockPriceFinder.scala FindTotalWorthSequential.scala
scala -classpath classes FindTotalWorthSequential