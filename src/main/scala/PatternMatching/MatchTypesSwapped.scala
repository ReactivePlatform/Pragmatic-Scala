/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def process(input: Any) {
  input match {
    case (a: Int, b: Int) => print("Processing (int, int)... ")
    case (a: Double, b: Double) => print("Processing (double, double)... ")
    case msg : Int => print("Processing int... ") 
    case msg : Int if (msg > 1000000) => println("Processing int > 1000000") 
    case msg: String => println("Processing string... ")
    case _ => printf(s"Can't handle $input... ")
  }
}

process((34.2, -159.3))
process(0)  
process(1000001)
process(2.2)
