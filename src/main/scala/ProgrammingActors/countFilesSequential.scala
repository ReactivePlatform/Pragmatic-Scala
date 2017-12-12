/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// ##snip
import java.io.File

def getChildren(file: File) = {
  val children = file.listFiles()
  if(children != null) children.toList else List()
}

val start = System.nanoTime
val exploreFrom = new File(args(0))

var count = 0L
var filesToVisit = List(exploreFrom)

while(filesToVisit.size > 0) {
  val head = filesToVisit.head
  filesToVisit = filesToVisit.tail
  
  val children = getChildren(head)
  count = count + children.count { !_.isDirectory }
  filesToVisit = filesToVisit ::: children.filter { _.isDirectory }
}

val end = System.nanoTime
println(s"Number of files found: $count")
println(s"Time taken: ${(end - start)/1.0e9} seconds")
// ##snip