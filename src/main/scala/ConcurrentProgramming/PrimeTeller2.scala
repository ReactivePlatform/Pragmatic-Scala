/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import scala.actors._
import Actor._

def isPrime(number: Int) = { 
  println("Going to find if " + number + " is prime")

  var result = true

  if (number > 1 && number < 4) result = true
              
  for (i <- 2 to Math.sqrt(number.toDouble).floor.toInt; if result) {               
    if (number % i == 0) result = false
  }
                              
  println("done finding if " + number + " is prime")                              
  result
}

val primeTeller = actor {
  var continue = true
  
  while (continue) {
    receive {
    //case (caller : Actor, number: Int) => caller ! (number, isPrime(number))
    case (caller : Actor, number: Int) => actor { caller ! (number, isPrime(number)) }
      case "quit" => continue = false
    }
  }
}

primeTeller ! (self, 2)
primeTeller ! (self, 131)
primeTeller ! (self, 132)

for (i <- 1 to 3) {
  receive {
    case (number, result) => println(number + " is prime? " + result)
  }
}

primeTeller ! "quit"
