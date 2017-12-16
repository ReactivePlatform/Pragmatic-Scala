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
  def getYearEndClosingPrice(symbol: String, year: Int) = {
    val url = s"http://ichart.finance.yahoo.com/table.csv?s=" +
      s"$symbol&a=11&b=01&c=$year&d=11&e=31&f=$year&g=m"

    val data = io.Source.fromURL(url).mkString
    val price = data.split("\n")(1).split(",")(4).toDouble
    price
  }
  // #snip_1-2

  // #snip_1-1
  val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
  val year = 2014

  val (topStock, topPrice) =
    symbols.map { ticker ⇒ (ticker, getYearEndClosingPrice(ticker, year)) }
      .maxBy { stockPrice ⇒ stockPrice._2 }

  printf(s"Top stock of $year is $topStock closing at price $$$topPrice")
  // #snip_1-1

}
