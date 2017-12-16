#!/usr/bin/env bash

echo 'def madMethod() = { throw new IllegalArgumentException() }' | scala | tail -n +4
