trait Trade
case class Sell(stockSymbol: String, quantity: Int) extends Trade
case class Buy(stockSymbol: String, quantity: Int) extends Trade
case class Hedge(stockSymbol: String, quantity: Int) extends Trade
object TradeProcessor {
  def processTransaction(request: Trade): Unit = {
    request match {
      case Sell(stock, 1000) => println(s"Selling 1000-units of $stock")
      case Sell(stock, quantity) =>
        println(s"Selling $quantity units of $stock")
      case Buy(stock, quantity) if quantity > 2000 =>
        println(s"Buying $quantity (large) units of $stock")
      case Buy(stock, quantity) =>
        println(s"Buying $quantity units of $stock")
    }
  }
}
TradeProcessor.processTransaction(Sell("GOOG", 500))
TradeProcessor.processTransaction(Buy("GOOG", 700))
TradeProcessor.processTransaction(Sell("GOOG", 1000))
TradeProcessor.processTransaction(Buy("GOOG", 3000))
