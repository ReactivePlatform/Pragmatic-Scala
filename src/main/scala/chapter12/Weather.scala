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

package chapter12

object Weather extends App {
  // #snip_12-12
  import scala.io.Source
  import scala.xml._

  def getWeatherData(city: String) = {
    val response = Source.fromURL(
      s"https://raw.githubusercontent.com/ReactivePlatform/" +
      s"Pragmatic-Scala-StaticResources/master/src/main/resources/" +
      s"weathers/$city.xml")
    val xmlResponse = XML.loadString(response.mkString)
    val cityName = (xmlResponse \\ "city" \ "@name").text
    val temperature = (xmlResponse \\ "temperature" \ "@value").text
    val condition = (xmlResponse \\ "weather" \ "@value").text
    (cityName, temperature, condition)
  }
  // #snip_12-12

  // #snip_12-13
  def printWeatherData(weatherData: (String, String, String)): Unit = {
    val (cityName, temperature, condition) = weatherData

    println(f"$cityName%-15s $temperature%-6s $condition")
  }
  // #snip_12-13

  // #snip_12-14
  def timeSample(getData: List[String] => List[(String, String, String)]): Unit = {
    val cities = List(
      "Houston,us",
      "Chicago,us",
      "Boston,us",
      "Minneapolis,us",
      "Oslo,norway",
      "Tromso,norway",
      "Sydney,australia",
      "Berlin,germany",
      "London,uk",
      "Krakow,poland",
      "Rome,italy",
      "Stockholm,sweden",
      "Bangalore,india",
      "Brussels,belgium",
      "Reykjavik,iceland")

    val start = System.nanoTime
    getData(cities).sortBy(_._1).foreach(printWeatherData)
    val end = System.nanoTime
    println(s"Time taken: ${(end - start) / 1.0e9} sec")
  }

  // #snip_12-14

  // #snip_12-15
  timeSample { cities =>
    cities.map(getWeatherData)
  }
  // #snip_12-15

  // #snip_12-16
  import scala.collection.parallel.CollectionConverters._
  timeSample { cities =>
    cities.par.map(getWeatherData).toList
  }
  // #snip_12-16

}
