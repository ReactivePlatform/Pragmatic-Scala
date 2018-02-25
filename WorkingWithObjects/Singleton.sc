import scala.collection._

class Marker(val color: String) {
  println(s"Creating ${this}")

  override def toString = s"marker color $color"
}

object MarkerFactory {
  private val markers = mutable.Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow"))

  def getMarker(color: String): Marker =
    markers.getOrElseUpdate(color, new Marker(color))
}

println(MarkerFactory getMarker "blue")
println(MarkerFactory getMarker "blue")
println(MarkerFactory getMarker "red")
println(MarkerFactory getMarker "red")
println(MarkerFactory getMarker "green")
