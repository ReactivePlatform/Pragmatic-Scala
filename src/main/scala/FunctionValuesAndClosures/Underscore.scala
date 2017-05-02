/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val arr = Array(1, 2, 3, 4, 5)

val total =  (0 /: arr) { (sum, elem) => sum + elem }
println(s"Sum of all values in array is $total")

{
val total = (0 /: arr) { _ + _ }
}         
println(s"Sum of all values in array is $total")
                              
val negativeNumberExists1 = arr.exists { elem => elem < 0 }
val negativeNumberExists2 = arr.exists { _ < 0 }
println(s"Array has negative number? $negativeNumberExists1")
println(s"Array has negative number? $negativeNumberExists2")
