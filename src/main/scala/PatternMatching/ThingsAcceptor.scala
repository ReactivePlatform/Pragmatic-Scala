/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_9-11
case class Apple()
case class Orange()
case class Book ()

object ThingsAcceptor {
  def acceptStuff(thing: Any) {
    thing match {
      case Apple() => println("Thanks for the Apple")
      case Orange() => println("Thanks for the Orange")
      case Book() => println("Thanks for the Book")
      case _ => println(s"Excuse me, why did you send me $thing")
    }
  }
}
// #snip_9-11

// #snip_9-12
ThingsAcceptor.acceptStuff(Apple())
ThingsAcceptor.acceptStuff(Book())
ThingsAcceptor.acceptStuff(Apple)
// #snip_9-12
