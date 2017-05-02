/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
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