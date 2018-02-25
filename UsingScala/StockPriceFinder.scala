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
  
  def getTickersAndUnits: Map[String, Int] = {
    val stocksAndUnitsXML = scala.xml.XML.load("stocks.xml")
    (Map[String, Int]() /: (stocksAndUnitsXML \ "symbol")) {
      (map, symbolNode) =>
        val ticker = (symbolNode \ "@ticker").toString
        val units = (symbolNode \ "units").text.toInt
        map + (ticker -> units)
    }
  }
}
