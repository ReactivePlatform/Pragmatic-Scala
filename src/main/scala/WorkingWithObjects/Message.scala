/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Message[T](val content: T) {
  override def toString = s"message content is $content"
  
  def is(value: T) = value == content
}

val message1 : Message[String] = new Message("howdy")
val message2 = new Message(42)

message1.is(22) //error: type mismatch

message2.is('A') //No error!
