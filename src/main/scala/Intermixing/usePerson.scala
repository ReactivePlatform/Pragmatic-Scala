/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val george = new Person("George", "Washington")

val georgesDogs = List(new Dog("Captain"), new Dog("Clode"), 
  new Dog("Forester"), new Dog("Searcher"))
                                    
println(s"$george had several dogs ${georgesDogs.mkString(", ")}...")