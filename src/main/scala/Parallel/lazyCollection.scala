/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val people = List(("Mark", 32), ("Bob", 22), ("Jane", 8), ("Jill", 21), 
("Nick", 50), ("Nancy", 42), ("Mike", 19), ("Sara", 12), ("Paula", 42), 
("John", 21))

def isOlderThan17(person: (String, Int)) = {
  println(s"isOlderThan17 called for $person")
  val (_, age) = person
  age > 17
}

def isNameStartsWithJ(person: (String, Int)) = {
  println(s"isNameStartsWithJ called for $person")
  val (name, _) = person
  name.startsWith("J")
}

println(people.view.filter {isOlderThan17}.filter {isNameStartsWithJ}.head)
