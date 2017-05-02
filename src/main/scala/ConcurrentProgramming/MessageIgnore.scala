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
val expectStringOrInteger = actor {
  for(i <- 1 to 4) {
    receiveWithin(1000) {
      case str : String => println("You said " + str)
      case num : Int => println("You gave " + num)
      case TIMEOUT => println("Timed out!")
    }
  }
}

expectStringOrInteger ! "only constant is change"
expectStringOrInteger ! 1024
expectStringOrInteger ! 22.22
expectStringOrInteger ! (self, 1024)

receiveWithin(3000) { case _ => }
