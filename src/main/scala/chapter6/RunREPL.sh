#!/usr/bin/env bash

echo 'import java.util.Date
def log(date: Date, message: String) =  println(s"$date ---- $message")
val logWithDateBound = log(new Date, _ : String)' | scala | tail +4
