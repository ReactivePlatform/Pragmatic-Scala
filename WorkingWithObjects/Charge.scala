package finance.currencies

object Charge {
  def chargeInUSD(money: Money): String = {
    def moneyInUSD = convert(money, Currency.USD)
    s"charged $$${moneyInUSD.amount}"
  }
}
