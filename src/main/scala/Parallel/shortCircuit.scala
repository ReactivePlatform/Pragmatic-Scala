/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def expensiveComputation() = {
  println("...assume slow operation...")
  false
}

def evaluate(input: Int) = {
  println(s"evaluate called with $input")
  if(input >= 10 && expensiveComputation())
    println("doing work...")
  else
    println("skipping")
}

evaluate(0)
evaluate(100)