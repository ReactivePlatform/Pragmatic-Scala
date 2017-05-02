/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class ShareCodeFunctional extends org.scalatest.Suite {
  def withList(testFunction : (java.util.ArrayList[Integer]) => Unit) {
    val list = new java.util.ArrayList[Integer]        
    
    try {
      testFunction(list)
    }
    finally {
      // perform any necessary cleanup here after return  
    }
  }
    
  def testListEmptyOnCreate() {
    withList { list => expect(0, "Expected size to be 0") { list.size() } }
  }
  
  def testGetOnEmptyList() {
    withList { 
      list => intercept[IndexOutOfBoundsException] { list.get(0) } 
    }
  }
}

(new ShareCodeFunctional).execute()
