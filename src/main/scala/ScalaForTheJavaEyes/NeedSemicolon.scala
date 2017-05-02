/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
object Sample {
  def apply() : Sample = new Sample
}           
              
class Sample

val sample1 = new Sample //OK, semicolon not needed
{
  println("semicolon is optional above")
}

val sample2 = Sample //Error, semicolon is needed
{
  println("semicolon is not optional above")
}

println("Won't work")
