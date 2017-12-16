#!/usr/bin/env bash

cat script.scala | scala | tail -n +15 | head -3
