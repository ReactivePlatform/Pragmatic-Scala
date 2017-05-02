/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val list1 = new java.util.ArrayList[Int];
{
  println("Created list1")
}

val list2 = new java.util.ArrayList[Int]
{
  println("Created list2")
}

println(list1.getClass())
println(list2.getClass())
