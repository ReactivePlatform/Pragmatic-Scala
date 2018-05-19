/*
 * Copyright 2018 pragmatic-scala.reactiveplatform.xyz
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

object ReadWriteXML extends App {
  //  #snip_15-11
  import scala.xml._

  val stocksAndUnits = XML load "stocks.xml"
  println(stocksAndUnits.getClass)
  println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")
  //  #snip_15-11

  //  #snip_15-12
  val stocksAndUnitsMap =
    (Map[String, Int]() /: (stocksAndUnits \ "symbol")) { (map, symbolNode) ⇒
      val ticker = (symbolNode \ "@ticker").toString
      val units = (symbolNode \ "units").text.toInt
      map + (ticker -> units) //return new map, with one additional entry
    }

  println(s"Number of symbol elements found is ${stocksAndUnitsMap.size}")
  //  #snip_15-12

  //  #snip_15-13
  val updatedStocksAndUnitsXML =
    <symbols>
      { stocksAndUnitsMap map updateUnitsAndCreateXML }
    </symbols>

  def updateUnitsAndCreateXML(element: (String, Int)) = {
    val (ticker, units) = element
    <symbol ticker={ ticker }>
      <units>{ units + 1 }</units>
    </symbol>
  }

  XML save ("stocks2.xml", updatedStocksAndUnitsXML)

  val elementsCount = (XML.load("stocks2.xml") \\ "symbol").size
  println(s"Saved file has $elementsCount symbol elements")
  //  #snip_15-13
}

