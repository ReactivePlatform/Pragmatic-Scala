import scala.collection._

class Marker private (val color: String) {
  println(s"Creating ${this}")

  override def toString = s"marker color $color"
}

object Marker {
  private val markers = mutable.Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow"))

  def getMarker(color: String): Marker =
    markers.getOrElseUpdate(color, new Marker(color))
}

println(Marker getMarker "blue")
println(Marker getMarker "blue")
println(Marker getMarker "red")
println(Marker getMarker "red")
println(Marker getMarker "green")
