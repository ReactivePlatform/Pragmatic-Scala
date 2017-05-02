/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val array = Array(2, 3, 5, 1, 6, 4)

val sum = array.foldLeft(0) { (sum, elem) => sum + elem }
val max = array.foldLeft(Integer.MIN_VALUE) { (large, elem) => 
   Math.max(large, elem) }

println(s"Sum of elements in array is $sum")
println(s"Max of elements in array is $max")

{
val sum = (0 /: array) { (sum, elem) => sum + elem }
val max = 
  (Integer.MIN_VALUE /: array) { (large, elem) => Math.max(large, elem) }

println(s"Sum of elements in array ${array.toString} is $sum")
println(s"Max of elements in array ${array.toString} is $max")
}
