import scala.io.Source
import scala.xml._

def getWeatherData(city: String) = {
  val url = "http://api.openweathermap.org/data/2.5/weather"

  val response = Source.fromURL(s"$url?q=$city&units=imperial&mode=xml")
  val xmlResponse = XML.loadString(response.mkString)
  val cityName = (xmlResponse \\ "city" \ "@name").text
  val temperature = (xmlResponse \\ "temperature" \ "@value").text
  val condition = (xmlResponse \\ "weather" \ "@value").text
  (cityName, temperature, condition)
}
def printWeatherData(weatherData: (String, String, String)): Unit = {
  val (cityName, temperature, condition) = weatherData

  println(f"$cityName%-15s $temperature%-6s $condition")
}
def timeSample(getData: List[String] ⇒ List[(String, String, String)]): Unit = {
  val cities = List("Houston,us", "Chicago,us", "Boston,us", "Minneapolis,us",
    "Oslo,norway", "Tromso,norway", "Sydney,australia", "Berlin,germany",
    "London,uk", "Krakow,poland", "Rome,italy", "Stockholm,sweden",
    "Bangalore,india", "Brussels,belgium", "Reykjavik,iceland")

  val start = System.nanoTime
  getData(cities) sortBy { _._1 } foreach printWeatherData
  val end = System.nanoTime
  println(s"Time taken: ${(end - start) / 1.0e9} sec")
}
timeSample { cities => cities map getWeatherData }
timeSample { cities => (cities.par map getWeatherData).toList }
