/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
//  #snip_9-8
trait Trade
case class Sell(stockSymbol: String, quantity: Int) extends Trade
case class Buy(stockSymbol: String, quantity: Int) extends Trade
case class Hedge(stockSymbol: String, quantity: Int) extends Trade
//  #snip_9-8

//  #snip_9-9
object TradeProcessor {
  def processTransaction(request : Trade) {
    request match {
      case Sell(stock, 1000) => println(s"Selling 1000-units of $stock")
      case Sell(stock, quantity) => 
            println(s"Selling $quantity units of $stock")
      case Buy(stock, quantity) if (quantity > 2000) => 
        println(s"Buying $quantity (large) units of $stock")
      case Buy(stock, quantity) => 
            println(s"Buying $quantity units of $stock")
    }
  }
}
//  #snip_9-9


//  #snip_9-10
TradeProcessor.processTransaction(Sell("GOOG", 500))
TradeProcessor.processTransaction(Buy("GOOG", 700))
TradeProcessor.processTransaction(Sell("GOOG", 1000))
TradeProcessor.processTransaction(Buy("GOOG", 3000))
//  #snip_9-10