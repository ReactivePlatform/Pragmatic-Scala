#!/usr/bin/env bash

scalac -d bin Equipment.scala EquipmentUseDry2.scala
scala -classpath bin EquipmentUseDry2
