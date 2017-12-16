#!/usr/bin/env bash

cat script.scala | scala | tail -n +7 | head -5
