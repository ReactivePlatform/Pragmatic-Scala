/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util.HashMap

class Marker private (val color: String) {
  println(s"Creating ${toString}")
  
  override def toString : String = "marker color " + color
}

object Marker {
  private var markers : HashMap[String, Marker] = new HashMap[String, Marker]
  
  def getMarker(color: String) : Marker = {
    if (!markers.containsKey(color)) {
      markers.put(color, new Marker(color))
    }
    
    markers.get(color)
  }
}
