/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def echo[T](input1: T, input2: T) = 
  println(s"received $input1 (${input1.getClass}) and $input2 (${input2.getClass})")

echo[Int]("hi", 5) //error: type mismatch
