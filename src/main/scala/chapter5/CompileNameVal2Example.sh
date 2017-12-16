#!/usr/bin/env bash

scalac NameVal2Example.scala
javap -c -p UseName\$ | tail -n +105 | head -14
