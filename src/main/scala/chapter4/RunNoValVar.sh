#!/usr/bin/env bash

scalac NoValVar.scala
javap -c -p -s NoValVar 
