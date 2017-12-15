/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_9-17
object StockService {
  def process(input : String) {
    input match {
      case Symbol() => println(s"Look up price for valid symbol $input")
      case ReceiveStockPrice(symbol, price) => 
        println(s"Received price $$$price for symbol $symbol")
      case _ => println(s"Invalid input $input")
    }
  }
}
// #snip_9-17

object Symbol {
  def unapply(symbol : String) : Boolean = symbol == "GOOG" || symbol == "IBM" 
    // you'd look up database above... here only GOOG and IBM are recognized
}

// #snip_9-18
object ReceiveStockPrice { 
  def unapply(input: String) : Option[(String, Double)] = {
    try {
      if (input contains ":") {
        val splitQuote = input split ":"
        Some(splitQuote(0), splitQuote(1).toDouble)
      }
      else {
        None
      }
    }
    catch {
      case _ : NumberFormatException => None
    }
  }
}
// #snip_9-18

// #snip_9-19
StockService process "GOOG"
StockService process "GOOG:310.84"
StockService process "GOOG:BUY"
StockService process "ERR:12.21"
// #snip_9-19
