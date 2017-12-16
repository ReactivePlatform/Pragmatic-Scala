#!/usr/bin/env bash

mkdir finance1/classes
scalac -d finance1/classes finance1/finance/currencies/*.scala finance1/*.scala
scala -classpath finance1/classes CurrencyApp
/bin/rm -rf finance1/classes