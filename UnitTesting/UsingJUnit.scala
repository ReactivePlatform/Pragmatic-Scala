import java.util

import org.junit.Assert._
import org.junit.Test

class UsingJUnit {
  @Test
  def listAdd(): Unit = {
    val list = new util.ArrayList[String]
    list.add("Milk")
    list add "Sugar"
    assertEquals(2, list.size)
  }
}
