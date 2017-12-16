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

import java.util.Calendar

object StockPriceFinder {
  def getLatestClosingPrice(symbol: String): Double = {
    val url = "http://ichart.finance.yahoo.com/table.csv?s=" +
      symbol + "&a=00&b=01&c=" + Calendar.getInstance().get(Calendar.YEAR)
    val data = scala.io.Source.fromURL(url).mkString
    val mostRecentData = data.split("\n")(1)
    val closingPrice = mostRecentData.split(",")(4).toDouble
    closingPrice
  }
  def getTickersAndUnits(): Map[String, Int] = {
    val stocksAndUnitsXML = scala.xml.XML.load("stocks.xml")
    (Map[String, Int]() /: (stocksAndUnitsXML \ "symbol")) {
      (map, symbolNode) ⇒
        val ticker = (symbolNode \ "@ticker").toString
        val units = (symbolNode \ "units").text.toInt
        map + (ticker -> units)
    }
  }
}
