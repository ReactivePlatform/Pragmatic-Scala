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

package chapter4

object Marker extends App {
  // #snip
  import scala.collection._

  class Marker private (val color: String) {
    println(s"Creating ${this}")

    override def toString = s"marker color $color"
  }

  object Marker {
    private val markers =
      mutable.Map("red" -> new Marker("red"), "blue" -> new Marker("blue"), "yellow" -> new Marker("yellow"))

    def getMarker(color: String): Marker =
      markers.getOrElseUpdate(color, new Marker(color))
  }

  println(Marker.getMarker("blue"))
  println(Marker.getMarker("blue"))
  println(Marker.getMarker("red"))
  println(Marker.getMarker("red"))
  println(Marker.getMarker("green"))
  // #snip

}
