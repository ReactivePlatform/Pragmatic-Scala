#!/usr/bin/env bash

scalac DateUtil.scala
javap -p -c UseDateUtil\$ | tail -n +97 | head -4