#!/usr/bin/env bash

scala -save mad2.scala 2>&1 | head > /dev/null
jar xf mad2.jar
javap -c -private Main\$\$anon\$1.class | head -18 | tail -n +3
/bin/rm -rf *.jar
/bin/rm -rf *.class
/bin/rm -rf META-INF
