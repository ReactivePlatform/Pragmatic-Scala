#!/usr/bin/env bash

echo 'def foo(a: Int)(b: Int)(c:Int) = {}
foo _' | scala | tail +4