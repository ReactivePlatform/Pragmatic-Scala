/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def compute(input: Int) = 
  if(input > 0)
    Right(math.sqrt(input))
  else
    Left("Error computing, invalid input")

def displayResult(result: Either[String, Double]) = {
  println(s"Raw: $result")
  result match {
    case Right(value) => println(s"result $value")
    case Left(err) => println(s"Error: $err")
  }
}

displayResult(compute(4))
displayResult(compute(-4))
