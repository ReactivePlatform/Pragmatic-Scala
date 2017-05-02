/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def isDivisibleBy(number: Int, divisor: Int) = number % divisor == 0

def isPrime(number: Int) = 
  number > 1 && !(2 to number - 1).exists { isDivisibleBy(number, _) }

def primes(starting: Int) : Stream[Int] = {
  println(s"computing for $starting")
  if(isPrime(starting))
    starting #:: primes(starting + 1)
  else
    primes(starting + 1)
}

val primesFrom100 = primes(100)

println(primesFrom100.take(3).toList)
println("Let's ask for more...")
println(primesFrom100.take(4).toList)
