/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_9-21
val pattern = "(S|s)cala".r        
val str = "Scala is scalable and cool"
println(pattern findFirstIn str)
// #snip_9-21

// #snip_9-22
println((pattern findAllIn str).mkString(", "))
// #snip_9-22

// #snip_9-23
println("cool".r replaceFirstIn(str, "awesome"))
// #snip_9-23
