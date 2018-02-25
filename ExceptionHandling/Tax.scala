object Tax {
  def taxFor(amount: Double): Double = {
    if (amount < 0)
      throw new IllegalArgumentException("Amount must be greater than zero")

    if (amount < 0.01)
      throw new RuntimeException("Amount too small to be taxed")

    if (amount > 1000000) throw new Exception("Amount too large...")

    amount * 0.08
  }
}
