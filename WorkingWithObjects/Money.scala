package finance.currencies

import Currency._

class Money(val amount: Int, val currency: Currency) {
  override def toString = s"$amount $currency"
}
