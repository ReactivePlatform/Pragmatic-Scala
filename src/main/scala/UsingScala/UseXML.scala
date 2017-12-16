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

println("/" + "/" + "START:DEFINE_OUTPUT")
val xmlFragment =
<symbols>
  <symbol ticker="AAPL"><units>200</units></symbol>
  <symbol ticker="IBM"><units>215</units></symbol>
</symbols>

println(xmlFragment)
println(xmlFragment.getClass)
println("/" + "/" + "END:DEFINE_OUTPUT")

println("/" + "/" + "START:QUERY1_OUTPUT")
var symbolNodes = xmlFragment \ "symbol"
symbolNodes foreach println
println(symbolNodes.getClass)
println("/" + "/" + "END:QUERY1_OUTPUT")

println("/" + "/" + "START:QUERY2_OUTPUT")
var unitsNodes = xmlFragment \\ "units"
unitsNodes foreach println
println(unitsNodes.getClass)
println(unitsNodes.head.text)
println("/" + "/" + "END:QUERY2_OUTPUT")

println("/" + "/" + "START:QUERY3_OUTPUT")
unitsNodes.head match {
  case <units>{numberOfUnits}</units> => println(s"Units: $numberOfUnits") 
}
println("/" + "/" + "END:QUERY3_OUTPUT")

println("/" + "/" + "START:QUERY4_OUTPUT")
println("Ticker\tUnits")
xmlFragment match {
  case <symbols>{symbolNodes @ _* }</symbols> =>
    for(symbolNode @ <symbol>{_*}</symbol> <- symbolNodes) {
      println("%-7s %s".format(
        symbolNode \ "@ticker", (symbolNode \ "units").text))
    }
}
println("/" + "/" + "END:QUERY4_OUTPUT")