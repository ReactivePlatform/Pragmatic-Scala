/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class ListTest extends org.scalatest.Suite {
  def testListEmpty() {
    val list = new java.util.ArrayList[Integer]
    assert(0 == list.size)
  }                          
  
  def testListAdd() {
    val list = new java.util.ArrayList[Integer]
    list.add(1) 
    list add 4
    assert(2 == list.size)
  }
}
