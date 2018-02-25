import finance.currencies._

object CurrencyApp extends App {
  var moneyInGBP = new Money(10, Currency.GBP)

  println(Charge.chargeInUSD(moneyInGBP))

  println(convert(moneyInGBP, Currency.USD))
}
