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

if (args.length > 0 && args(0) == "Single") {                      
  println("Command-line argument Single found")
  Scheduler.impl = new SingleThreadedScheduler
}

println("Main running in " + Thread.currentThread)

actor { println("Actor1 running in " + Thread.currentThread) }                                                   

actor { println("Actor2 running in " + Thread.currentThread) }

receiveWithin(3000) { case _ => }