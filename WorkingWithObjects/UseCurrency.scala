import finance.currencies.Currency

object UseCurrency extends App {
  Currency.values.foreach { currency => println(currency) }
}
