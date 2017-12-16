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

package chapter12

object weather extends App {
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

  println("//" + "START:SEQUENTIAL_OUTPUT")
  timeSample { cities ⇒ cities map getWeatherData }
  println("//" + "END:SEQUENTIAL_OUTPUT")

  println("//" + "START:PARALLEL_OUTPUT")
  timeSample { cities ⇒ (cities.par map getWeatherData).toList }
  println("//" + "END:PARALLEL_OUTPUT")
}
