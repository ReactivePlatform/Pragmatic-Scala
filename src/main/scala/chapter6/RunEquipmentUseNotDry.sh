#!/usr/bin/env bash

scalac -d bin Equipment.scala EquipmentUseNotDry.scala
scala -classpath bin EquipmentUseNotDry 
