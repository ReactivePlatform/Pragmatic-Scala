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

package chapter1

object TopStock extends App {

  import scala.io

  // #snip_1-2
  case class Record(year: Int, month: Int, date: Int, closePrice: BigDecimal)

  def getYearEndClosingPrice(symbol: String, year: Int): BigDecimal = {
    val url = s"https://raw.githubusercontent.com/ReactivePlatform/" +
      s"Pragmatic-Scala-StaticResources/master/src/main/resources/" +
      s"stocks/daily/daily_$symbol.csv"

    val data = io.Source.fromURL(url).mkString
    val maxClosePrize = data.split("\n")
      .filter(record ⇒ record.startsWith(s"$year-12"))
      .map(record ⇒ {
        val Array(timestamp, open, high, low, close, volume) = record.split(",")
        val Array(year, month, date) = timestamp.split("-")
        Record(year.toInt, month.toInt, date.toInt, BigDecimal(close.trim))
      })
      .sortBy(_.date)(Ordering[Int].reverse)
      .take(1)
      .map(_.closePrice)
      .head
    maxClosePrize
  }

  // #snip_1-2

  // #snip_1-1
  val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
  val year = 2017

  val (topStock, topPrice) =
    symbols.map { ticker ⇒ (ticker, getYearEndClosingPrice(ticker, year)) }
      .maxBy { stockPrice ⇒ stockPrice._2 }

  printf(s"Top stock of $year is $topStock closing at price $$$topPrice")
  // #snip_1-1

}
