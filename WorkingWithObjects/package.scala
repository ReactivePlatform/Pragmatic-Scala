package finance

package object currencies {
  import Currency._

  def convert(money: Money, to: Currency): Money = {
    //fetch current market rate... using mocked value here
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}
