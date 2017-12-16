#!/usr/bin/env bash

cat script.scala | scala | tail -n +12 | head -3
