#!/usr/bin/env bash

scala factorialTCO.scala 2>&1 | fold -w 75 -s | head -1
echo "..."
