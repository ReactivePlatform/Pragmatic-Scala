#!/usr/bin/env bash

scalac ValDateUtil.scala
javap -p -c UseDateUtil\$ | tail -n +98 | head -4
