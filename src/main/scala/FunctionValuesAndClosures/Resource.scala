/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Resource private() {
  println("Starting transaction...")
  private def cleanUp() { println("Ending transaction...") }
  def op1() = println("Operation 1") 
  def op2() = println("Operation 2")
  def op3() = println("Operation 3")
}

object Resource {
  def use(codeBlock: Resource => Unit) {
    val resource = new Resource
    try {
      codeBlock(resource)    
    }
    finally {
      resource.cleanUp()
    }
  }
}

Resource.use { resource =>
  resource.op1()
  resource.op2()
  resource.op3()
  resource.op1()
}
