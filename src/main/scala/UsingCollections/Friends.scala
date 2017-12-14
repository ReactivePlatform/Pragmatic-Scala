/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_8-33
class Person(val firstName: String, val lastName: String)
object Person {
  def apply(firstName: String, lastName: String) : Person = 
    new Person(firstName, lastName)
}
val friends = List(Person("Brian", "Sletten"), Person("Neal", "Ford"),
  Person("Scott", "Davis"), Person("Stuart", "Halloway"))
  
val lastNames = 
  for (friend <- friends; lastName = friend.lastName) yield lastName

println(lastNames.mkString(", "))
// #snip_8-33
