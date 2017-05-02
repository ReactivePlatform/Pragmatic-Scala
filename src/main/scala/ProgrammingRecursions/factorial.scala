/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def factorial(number: Int) : BigInt = {
  if(number == 0)
    1
  else
    number * factorial(number - 1)  
}

println("//" + "START:USE1_OUTPUT")
println(factorial(5))
println("//" + "END:USE1_OUTPUT")

println("//" + "START:STACK_OVERFLOW_OUTPUT")
try {
println(factorial(10000))
} catch {
  case ex : Throwable => println(ex)
}
println("//" + "END:STACK_OVERFLOW_OUTPUT")
