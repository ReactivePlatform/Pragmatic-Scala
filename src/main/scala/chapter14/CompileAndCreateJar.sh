#!/usr/bin/env bash

// #snip
scalac Person.scala Dog.scala
jar cf /tmp/example.jar Person.class Dog.class
// #snip
