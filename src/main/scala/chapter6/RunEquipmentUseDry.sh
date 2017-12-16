#!/usr/bin/env bash

scalac -d bin Equipment.scala EquipmentUseDry.scala
scala -classpath bin EquipmentUseDry
