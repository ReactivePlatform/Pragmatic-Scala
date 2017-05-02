/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Sample {
  val max = 100

  def process(input: Int) {
    input match {
      case `max` => println(s"You matched max $max")
    }
  }
}

val sample = new Sample
try {
  sample.process(0)  
} catch {
  case ex: Throwable => println(ex)
}
sample.process(100)