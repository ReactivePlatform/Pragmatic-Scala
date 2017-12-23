/*
 * Copyright 2017 pragmatic-scala.reactiveplatform.xyz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package chapter15

object FindTotalWorthConcurrent extends App {
  val symbolsAndUnits = StockPriceFinder.getTickersAndUnits

  println("Ticker  Units  Closing Price($) Total Value($)")

  val startTime = System.nanoTime()
  //  #snip
  val valuesAndWorth = symbolsAndUnits.keys.par.map { symbol ⇒
    //  #snip
    val units = symbolsAndUnits(symbol)
    val latestClosingPrice = StockPriceFinder getLatestClosingPrice symbol
    val value = units * latestClosingPrice

    (symbol, units, latestClosingPrice, value)
  }

  val netWorth = (0.0 /: valuesAndWorth) { (worth, valueAndWorth) ⇒
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
