/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def totalResultOverRange(number: Int, codeBlock: Int => Int) = {
  var result = 0
  for (i <- 1 to number) {
    result += codeBlock(i)    
  }
  result
}                         

println(totalResultOverRange(11, i => i))

println(totalResultOverRange(11, i => if (i % 2 == 0) i else 0))
               
println(totalResultOverRange(11, i => if (i % 2 != 0) i else 0))
