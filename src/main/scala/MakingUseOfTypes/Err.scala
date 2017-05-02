/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import scala.language.implicitConversions

class One(val number: Int) {
  def foo= "one"
}

class Two(val number: Int) {
  def foo= "two"
}

implicit def convertIntToOne(number: Int) = new One(number)
implicit def convertIntToTwo(number: Int) = new Two(number)

println(2.foo)
println(2.foo)