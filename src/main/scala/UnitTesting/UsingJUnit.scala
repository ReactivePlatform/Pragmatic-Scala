/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util.ArrayList
import org.junit.Test
import org.junit.Assert._

class UsingJUnit {
  @Test 
  def listAdd() {
    val list = new ArrayList[String]
    list.add("Milk")
    list add "Sugar" 
    assertEquals(2, list.size)
  }
}
