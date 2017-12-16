#!/usr/bin/env bash

scala -save mad.scala 2>&1 | head > /dev/null
jar xf mad.jar
javap -c -private Main\$\$anon\$1.class | head -20 | tail -n +3
/bin/rm -rf *.jar
/bin/rm -rf *.class
/bin/rm -rf META-INF
