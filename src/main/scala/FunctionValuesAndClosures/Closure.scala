/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def loopThrough(number: Int)(closure: Int => Unit) {
  for (i <- 1 to number) { closure(i) }
}
                   
var result = 0
val addIt = { value:Int => result += value }

loopThrough(10) { elem => addIt(elem) }
println(s"Total of values from 1 to 10 is $result")

result = 0
loopThrough(5) { addIt }
println(s"Total of values from 1 to 5 is $result")

var product = 1
loopThrough(5) { product *= _ }
println(s"Product of values from 1 to 5 is $product")
