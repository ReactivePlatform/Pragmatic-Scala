#!/usr/bin/env bash

scalac NameExample.scala
javap -c -p UseName\$ | tail -n +96 | head -14