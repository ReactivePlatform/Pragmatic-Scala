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

package chapter1

object FindMaxImperative extends App {
  // #snip
  def findMax(temperatures: List[Int]) = {
    var highTemperature = Integer.MIN_VALUE
    for (temperature <- temperatures) {
      highTemperature = Math.max(highTemperature, temperature)
    }
    highTemperature
  }
  // #snip

  println(findMax(List(23, 27, 17)))

}
