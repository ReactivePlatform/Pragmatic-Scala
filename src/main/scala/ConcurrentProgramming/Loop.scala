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
val caller = self
val accumulator = actor {
  var continue = true
  var sum = 0
  loopWhile(continue) {
    reactWithin(500) {
      case number : Int => sum += number
      case TIMEOUT => 
        continue = false
        caller ! sum
    }
  }
}

accumulator ! 1
accumulator ! 7
accumulator ! 8

receiveWithin(1000) { case result => println("Total is " + result) }
