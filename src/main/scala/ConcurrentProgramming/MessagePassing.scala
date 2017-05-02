/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import scala.actors.Actor._

var startTime : Long = 0
val caller = self

val engrossedActor = actor {
  println("Number of messages received so far? " + mailboxSize)
  caller ! "send"
  Thread.sleep(3000)
  println("Number of messages received while I was busy? " + mailboxSize)
  receive {
    case msg => 
      val receivedTime = System.currentTimeMillis() - startTime      
      println("Received message " + msg + " after " + receivedTime + " ms")
  }          
  caller ! "received"
}

receive { case _ => }
                                          
println("Sending Message ")
startTime = System.currentTimeMillis()
engrossedActor ! "hello buddy"
val endTime = System.currentTimeMillis() - startTime

printf("Took less than %dms to send message\n", endTime)

receive {
  case _ =>
}