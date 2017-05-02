/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val arr = Array(1, 2, 3, 4, 5)

val largest = 
  (Integer.MIN_VALUE /: arr) { (carry, elem) => Math.max(carry, elem)}

println(largest)

{
val largest = (Integer.MIN_VALUE /: arr) { Math.max(_, _)}

println(largest)
}

{
val largest = (Integer.MIN_VALUE /: arr) { Math.max _ }

println(largest)
}

{
val largest = (Integer.MIN_VALUE /: arr) { Math.max }

println(largest)
}