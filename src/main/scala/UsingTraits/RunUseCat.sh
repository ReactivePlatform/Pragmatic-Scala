#---
# Excerpted from "Pragmatic Scala",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material, 
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose. 
# Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
#---
export binDir=`pwd`/bin
mkdir -p $binDir
export replacestring="s/\([a-zA-Z0-9\/]*\)\(UseCat\)/\2/"
scalac -d $binDir Friend.scala Animal.scala Cat.scala
scalac -classpath $binDir UseCat.scala | sed $replacestring | fold -w 75 -s