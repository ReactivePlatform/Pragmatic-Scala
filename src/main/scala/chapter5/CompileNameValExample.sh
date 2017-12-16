#!/usr/bin/env bash

scalac NameValExample.scala
javap -c -p UseName\$ | tail -n +97 | head -14
