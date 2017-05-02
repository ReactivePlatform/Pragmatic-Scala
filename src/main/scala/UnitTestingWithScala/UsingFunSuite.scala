/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class UsingFunSuite extends org.scalatest.FunSuite {
  def withList(testFunction : (java.util.ArrayList[Integer]) => Unit) {
    val list = new java.util.ArrayList[Integer]        
    
    try {
      testFunction(list)
    }
    finally {
      // perform any necessary cleanup here after return  
    }
  }
    
  test("Check if the list is Empty On Creation") {
    withList { list => expect(0, "Expected size to be 0") { list.size() } }
  }
  
  test("Get must throw exception when called on an empty list") {
    withList { 
      list => intercept[IndexOutOfBoundsException] { list.get(0) } 
    }
  }
}

(new UsingFunSuite).execute()
