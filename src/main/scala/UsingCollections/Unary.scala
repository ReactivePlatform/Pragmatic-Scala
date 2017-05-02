/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Sample {
  def unary_+() = println("Called unary +")
  def unary_-() = println("called unary -")
  def unary_!() = println("called unary !")
  def unary_~() = println("called unary ~")
}

val sample = new Sample
+sample
-sample
!sample
~sample
