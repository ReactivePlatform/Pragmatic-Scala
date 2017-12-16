#!/usr/bin/env bash

scalac Person.scala Dog.scala
jar cf /tmp/example.jar Person.class Dog.class
