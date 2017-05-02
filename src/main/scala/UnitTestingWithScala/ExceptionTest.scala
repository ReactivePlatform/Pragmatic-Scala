/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class ExceptionTest extends org.scalatest.Suite {
  def testGetOnEmptyList() {
    try {
      val list = new java.util.ArrayList[Integer]
      list.get(0)
      fail("Expected exception for getting element from empty list")
    }  
	
    catch {
      case ex: IndexOutOfBoundsException => // :) Success
    }
  }

  def testGetOnEmptyList_Concise() {
      val list = new java.util.ArrayList[Integer]
      intercept(classOf[IndexOutOfBoundsException], 
          "Expected exception for getting element from empty list") { 
        list.get(0) 
      }
      
      //You'll get a deprecation warning from the statement above.
      //ScalaTest is evolving to use a newer style for intercept.
      //Currently the new style does not take an error message argument.
      //When it does, you should use
      //intercept[IndexOutOfBoundsException] ("Expected ...") {...}      
  }
}

(new ExceptionTest).execute()
