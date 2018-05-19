object FindTotalWorthSequential extends App {
  val symbolsAndUnits = StockPriceFinder.getTickersAndUnits

  println("Ticker  Units  Closing Price($) Total Value($)")

  val startTime = System.nanoTime()
  val valuesAndWorth = symbolsAndUnits.keys.map { symbol ⇒
    val units = symbolsAndUnits(symbol)
    val latestClosingPrice = StockPriceFinder getLatestClosingPrice symbol
    val value = units * latestClosingPrice

    (symbol, units, latestClosingPrice, value)
  }

  val netWorth = (BigDecimal(0.0D) /: valuesAndWorth) { (worth, valueAndWorth) ⇒
    val (_, _, _, value) = valueAndWorth
    worth + value
  }
  val endTime = System.nanoTime()

  valuesAndWorth.toList.sortBy { _._1 }.foreach { valueAndWorth ⇒
    val (symbol, units, latestClosingPrice, value) = valueAndWorth
    println(f"$symbol%7s  $units%5d  $latestClosingPrice%15.2f  $value%.2f")
  }

  println(f"The total value of your investments is $$$netWorth%.2f")
  println(f"Took ${(endTime - startTime) / 1000000000.0}%.2f  seconds")
}
