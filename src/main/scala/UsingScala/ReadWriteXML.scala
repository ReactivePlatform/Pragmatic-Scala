/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
println("/" + "/" + "START:READ_OUTPUT")
import scala.xml._

val stocksAndUnits = XML load "stocks.xml"
println(stocksAndUnits.getClass())
println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")
println("/" + "/" + "END:READ_OUTPUT")

println("/" + "/" + "START:PARSE_OUTPUT")
val stocksAndUnitsMap =
  (Map[String, Int]() /: (stocksAndUnits \ "symbol")) { (map, symbolNode) =>
    val ticker = (symbolNode \ "@ticker").toString
    val units = (symbolNode \ "units").text.toInt
    map + (ticker -> units) //return new map, with one additional entry
  }
  
println(s"Number of symbol elements found is ${stocksAndUnitsMap.size}")
println("/" + "/" + "END:PARSE_OUTPUT")

println("/" + "/" + "START:STORE_OUTPUT")
val updatedStocksAndUnitsXML = 
<symbols>
  { stocksAndUnitsMap map updateUnitsAndCreateXML }
</symbols>

def updateUnitsAndCreateXML(element : (String, Int)) = {
  val (ticker, units) = element
  <symbol ticker={ticker}>
    <units>{units + 1}</units>
  </symbol>
}

XML save ("stocks2.xml", updatedStocksAndUnitsXML)

val elementsCount = (XML.load("stocks2.xml") \\ "symbol").size
println(s"Saved file has ${elementsCount} symbol elements")
println("/" + "/" + "END:STORE_OUTPUT")
