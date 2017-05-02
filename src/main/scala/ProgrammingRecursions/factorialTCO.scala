/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
@scala.annotation.tailrec
def factorial(fact: BigInt, number: Int) : BigInt = {
  if(number == 0)
    fact
  else
    factorial(fact * number, number - 1)
}

println(factorial(1, 10000))