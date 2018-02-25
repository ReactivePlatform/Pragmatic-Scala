object Symbol {
  def unapply(symbol: String): Boolean = {
    // you'd look up a database... here only GOOG and IBM are recognized
    symbol == "GOOG" || symbol == "IBM"
  }
}
object StockService {
  def process(input: String): Unit = {
    input match {
      case Symbol() => println(s"Look up price for valid symbol $input")
      case ReceiveStockPrice(symbol, price) ⇒
        println(s"Received price $$$price for symbol $symbol")
      case _ => println(s"Invalid input $input")
    }
  }
}
object ReceiveStockPrice {
  def unapply(input: String): Option[(String, Double)] = {
    try {
      if (input contains ":") {
        val splitQuote = input split ":"
        Some((splitQuote(0), splitQuote(1).toDouble))
      } else {
        None
      }
    } catch {
      case _: NumberFormatException ⇒ None
    }
  }
}
StockService process "GOOG"
StockService process "GOOG:310.84"
StockService process "GOOG:BUY"
StockService process "ERR:12.21"
