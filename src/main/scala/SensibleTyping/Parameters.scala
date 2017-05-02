/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def divide(op1: Double, op2: Double) = op1/op2

def max(values: Int*) = values.foldLeft(values(0)) { Math.max }
                         

println(max(2, 5, 3, 7, 1, 6))

val numbers = Array(2, 5, 3, 7, 1, 6)

/*
println(max(numbers)) // type mismatch error
*/

println(max(numbers: _*))
