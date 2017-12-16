#!/usr/bin/env bash

export replacestring="s/\(.*\)\(error\)/\2/"
scala factorialNoTCO.scala 2>&1 | sed $replacestring | fold -w 75 -s