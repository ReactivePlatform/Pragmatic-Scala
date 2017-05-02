/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def processItems(items: List[String]) {
  items match {
    case List("apple", "ibm") => println("Apples and IBMs")
    case List("red", "blue", "white") => println("Stars and Stripes...")
    case List("red", "blue", _*) => println("colors red, blue,... ")
    case List("apple", "orange", otherFruits @ _*) => 
      println("apples, oranges, and " + otherFruits)
  }
}

processItems(List("apple", "ibm"))
processItems(List("red", "blue", "green"))
processItems(List("red", "blue", "white"))
processItems(List("apple", "orange", "grapes", "dates"))
