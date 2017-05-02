/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util.Calendar

object StockPriceFinder {
  def getLatestClosingPrice(symbol: String) : Double = {
    val url = "http://ichart.finance.yahoo.com/table.csv?s=" +
        symbol + "&a=00&b=01&c=" + Calendar.getInstance().get(Calendar.YEAR)
    val data = scala.io.Source.fromURL(url).mkString
    val mostRecentData = data.split("\n")(1)                
    val closingPrice = mostRecentData.split(",")(4).toDouble
    closingPrice
  }
  def getTickersAndUnits() = {
    val stocksAndUnitsXML = scala.xml.XML.load("stocks.xml")
    (Map[String, Int]() /: (stocksAndUnitsXML \ "symbol")) { 
      (map, symbolNode) =>
        val ticker = (symbolNode \ "@ticker").toString
        val units = (symbolNode \ "units").text.toInt
        map + (ticker -> units)
      }  
  }
}
