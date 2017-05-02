/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import akka.actor._
import scala.collection.mutable._

case class Play(role: String)
case class ReportCount(role: String)

class HollywoodActor() extends Actor {
  val messagesCount : Map[String, Int] = Map()
  
  def receive = {
    case Play(role) => 
      val currentCount = messagesCount.getOrElse(role, 0)
      messagesCount.update(role, currentCount + 1)
      println(s"Playing $role")
    
    case ReportCount(role) => 
      sender ! messagesCount.getOrElse(role, 0)
  }
}
