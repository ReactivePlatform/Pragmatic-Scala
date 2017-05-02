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
trait SingleThreadedActor extends Actor {
  override protected def scheduler() = new SingleThreadedScheduler
}
class MyActor1 extends Actor {
  def act() = println("Actor1 running in " + Thread.currentThread)
}
                      
class MyActor2 extends SingleThreadedActor {                     
  def act() = println("Actor2 running in " + Thread.currentThread)
}                                                      

println("Main running in " + Thread.currentThread)
new MyActor1().start()
new MyActor2().start()
actor { println("Actor 3 running in " + Thread.currentThread) }

receiveWithin(5000) { case _ => }