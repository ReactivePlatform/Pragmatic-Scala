import scala.xml._

val stocksAndUnits = XML load "stocks.xml"
println(stocksAndUnits.getClass)
println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")
val stocksAndUnitsMap =
  (Map[String, Int]() /: (stocksAndUnits \ "symbol")) { (map, symbolNode) =>
    val ticker = (symbolNode \ "@ticker").toString
    val units = (symbolNode \ "units").text.toInt
    map + (ticker -> units) //return new map, with one additional entry
  }

println(s"Number of symbol elements found is ${stocksAndUnitsMap.size}")
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
