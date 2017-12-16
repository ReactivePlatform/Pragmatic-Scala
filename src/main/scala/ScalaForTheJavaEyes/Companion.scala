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
