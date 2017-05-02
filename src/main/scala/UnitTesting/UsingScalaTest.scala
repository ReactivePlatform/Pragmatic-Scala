/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import org.scalatest._
import java.util.ArrayList

class UsingScalaTest extends FlatSpec with Matchers {
  trait EmptyArrayList {
    val list = new ArrayList[String]
  }
  
  "a list" should "be empty on create" in new EmptyArrayList {
    list.size should be (0)
  }
  
  "a list" should "increase in size upon add" in new EmptyArrayList {
    list.add("Milk")
    list add "Sugar" 

    list.size should be (2)
  }
}