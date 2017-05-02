/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def sumOfFactors(number: Int) = {
  (0 /: (1 to number)) { (sum, i) => if (number % i == 0) sum + i else sum }
}
def isPerfect(candidate: Int) = 2 * candidate == sumOfFactors(candidate)

println("6 is perfect? " + isPerfect(6))
println("33550336 is perfect? " + isPerfect(33550336))
println("33550337 is perfect? " + isPerfect(33550337))
