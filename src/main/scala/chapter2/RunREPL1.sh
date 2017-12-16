#!/usr/bin/env bash

cat script.scala | scala | tail -n +4 | head -3
