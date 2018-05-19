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

object UseXML extends App {
  //  #snip_15-5
  val xmlFragment =
    <symbols>
      <symbol ticker="AAPL"><units>200</units></symbol>
      <symbol ticker="IBM"><units>215</units></symbol>
    </symbols>

  println(xmlFragment)
  println(xmlFragment.getClass)
  //  #snip_15-5

  //  #snip_15-6
  var symbolNodes = xmlFragment \ "symbol"
  symbolNodes foreach println
  println(symbolNodes.getClass)
  //  #snip_15-6

  //  #snip_15-7
  var unitsNodes = xmlFragment \\ "units"
  unitsNodes foreach println
  println(unitsNodes.getClass)
  println(unitsNodes.head.text)
  //  #snip_15-7

  //  #snip_15-8
  unitsNodes.head match {
    case <units>{ numberOfUnits }</units> ⇒ println(s"Units: $numberOfUnits")
  }
  //  #snip_15-8

  //  #snip_15-9
  println("Ticker\tUnits")
  xmlFragment match {
    case <symbols>{ symbolNodes @ _* }</symbols> ⇒
      for (symbolNode @ <symbol>{ _* }</symbol> ← symbolNodes) {
        println("%-7s %s".format(
          symbolNode \ "@ticker", (symbolNode \ "units").text))
      }
  }
  //  #snip_15-9
}
