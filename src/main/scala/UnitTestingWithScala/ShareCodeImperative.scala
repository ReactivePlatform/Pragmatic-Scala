/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class ShareCodeImperative extends org.scalatest.Suite 
  with org.scalatest.BeforeAndAfter {
  var list : java.util.ArrayList[Integer] = _
  
  override def beforeEach() { list = new java.util.ArrayList[Integer] }
  override def afterEach() { list = null }
  def testListEmptyOnCreate() {
    expect(0, "Expected size to be 0") { list.size() }
  }
  def testGetOnEmptyList() {
    intercept[IndexOutOfBoundsException] { list.get(0) }
  }
}
(new ShareCodeImperative).execute()
