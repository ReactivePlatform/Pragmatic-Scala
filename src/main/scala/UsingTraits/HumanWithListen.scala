/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Human(val name: String) {
  def listen() = println(s"Your friend $name is listening")
}

class Man(override val name: String) extends Human(name)
class Woman(override val name: String) extends Human(name)

println(new Man("John").getClass())
println(new Woman("Sara").getClass())
