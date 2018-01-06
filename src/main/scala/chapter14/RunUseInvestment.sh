#!/usr/bin/env bash

// #snip
mkdir -p classes
javac -d classes java/InvestmentType.java java/Investment.java
scalac -classpath classes UseInvestment.scala
scala -classpath classes:. UseInvestment
// #snip
