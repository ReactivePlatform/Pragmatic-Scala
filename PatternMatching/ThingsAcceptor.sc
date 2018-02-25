case class Apple()
case class Orange()
case class Book()

object ThingsAcceptor {
  def acceptStuff(thing: Any): Unit = {
    thing match {
      case Apple()  => println("Thanks for the Apple")
      case Orange() => println("Thanks for the Orange")
      case Book()   => println("Thanks for the Book")
      case _        => println(s"Excuse me, why did you send me $thing")
    }
  }
}
ThingsAcceptor.acceptStuff(Apple())
ThingsAcceptor.acceptStuff(Book())
ThingsAcceptor.acceptStuff(Apple)
