#---
# Excerpted from "Pragmatic Scala",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material, 
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose. 
# Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
#---
scala -save mad2.scala 2>&1 | head > /dev/null
jar xf mad2.jar
javap -c -private Main\$\$anon\$1.class | head -18 | tail -n +3
/bin/rm -rf *.jar
/bin/rm -rf *.class
/bin/rm -rf META-INF
