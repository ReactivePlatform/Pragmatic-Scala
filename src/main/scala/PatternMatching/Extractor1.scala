/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_9-15
object StockService {
  def process(input : String) {
    input match {
      case Symbol() => println(s"Look up price for valid symbol $input")
      case _ => println(s"Invalid input $input")
    }
  }
}
// #snip_9-15

// #snip_9-16
object Symbol {
  def unapply(symbol : String) : Boolean = {
    // you'd look up a database... here only GOOG and IBM are recognized
    symbol == "GOOG" || symbol == "IBM" 
  }
}
// #snip_9-16

// #snip_9-14
StockService process "GOOG"
StockService process "IBM"
StockService process "ERR"
// #snip_9-14
