#---
# Excerpted from "Pragmatic Scala",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material, 
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose. 
# Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
#---
scalac -classpath $SCALATEST:$JUNITJAR:. \
  UsingJUnit3Suite.scala RunJUnitTest.scala
echo "Running ScalaTest"
scala -classpath $SCALATEST:$JUNITJAR:. \
  org.scalatest.tools.Runner -o -p . -s UsingJUnit3Suite
echo "Running JUNIT test"
java -classpath $SCALALIBRARY:$SCALATEST:$JUNITJAR:. RunJUnitTest
