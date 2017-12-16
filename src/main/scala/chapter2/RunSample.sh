#!/usr/bin/env bash

echo '> scalac Sample.scala'
scalac Sample.scala
echo '> scala Sample'
scala Sample
echo '> java -classpath /opt/scala/current/lib/scala-library.jar:. Sample'
java -classpath /opt/scala/current/lib/scala-library.jar:. Sample
/bin/rm -f *.class
