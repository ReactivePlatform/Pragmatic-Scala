#!/usr/bin/env bash

mkdir -p classes
scalac -deprecation -d classes StockPriceFinder.scala FindTotalWorthConcurrent.scala
scala -classpath classes FindTotalWorthConcurrent