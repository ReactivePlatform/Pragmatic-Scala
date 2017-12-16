#!/usr/bin/env bash

mkdir -p classes
javac -d classes java/InvestmentType.java java/Investment.java
scalac -classpath classes UseInvestmentYield.scala
