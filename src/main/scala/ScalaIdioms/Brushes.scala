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

class Brushes {
  var colors = new Array[String](5)
  
  def update(index: Int, color: String) { 
    if (index < 0 || index > 4) {
      throw new IllegalArgumentException("Invalid index. Must be between 0 and 4.")
    }
                         
    if (colors.contains(color)) {
      throw new IllegalArgumentException("Color already present.");
    }
    else {
      colors(index) = color
    }
  }
}

val brushes = new Brushes
brushes(0) = "Red"
brushes(1) = "Blue"
brushes(2) = "Green"

brushes(4) = "Orange"

try {
brushes.update(4, "Orange")
}
catch {
 case _ => println("Exception received")
}
