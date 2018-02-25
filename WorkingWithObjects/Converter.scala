package finance.currencies

import Currency._

object Converter {
  def convert(money: Money, to: Currency): Money = {
    //fetch current market rate... using mocked value here
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}
