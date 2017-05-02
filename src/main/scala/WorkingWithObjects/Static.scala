/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import scala.collection.mutable._

class Marker private (val color: String) {
  override def toString = s"marker color $color"
}
object Marker {
  private val markers = Map( 
    "red" -> new Marker("red"), 
    "blue" -> new Marker("blue"), 
    "yellow" -> new Marker("yellow"))
    
  def supportedColors = markers.keys
  def apply(color: String) = markers.getOrElseUpdate(color, new Marker(color))
}
println(s"Supported colors are : ${Marker.supportedColors}")
println(Marker("blue"))
println(Marker("red"))
