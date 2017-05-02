/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Person(val firstName: String, val lastName: String) {
  var position: String = _
  
  println(s"Creating ${toString}")

  def this (firstName: String, lastName: String, positionHeld: String) {
    this (firstName, lastName)                                    
    position = positionHeld
  }
  override def toString : String = {
    s"$firstName $lastName holds $position position"
  }
}

val john = new Person("John", "Smith", "Analyst") 
println(john) 
val bill = new Person("Bill", "Walker") 
println(bill) 
