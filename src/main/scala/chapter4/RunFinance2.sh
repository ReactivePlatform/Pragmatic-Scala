#!/usr/bin/env bash

mkdir finance2/classes
scalac -d finance2/classes finance2/finance/currencies/*.scala finance2/*.scala
scala -classpath finance2/classes CurrencyApp
/bin/rm -rf finance2/classes