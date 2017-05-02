/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def inject(arr: Array[Int], initial: Int, operation: (Int, Int) => Int) = {   
  var carryOver = initial
  arr.foreach(element => carryOver = operation(carryOver, element) )
  carryOver
}

val array = Array(2, 3, 5, 1, 6, 4)
val sum = inject(array, 0, (carry, elem) => carry + elem)
println(s"Sum of elements in array is $sum")

val max = 
  inject(array, Integer.MIN_VALUE, (carry, elem) => Math.max(carry, elem))
println(s"Max of elements in array is  $max")
