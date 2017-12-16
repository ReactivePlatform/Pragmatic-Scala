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

package chapter6

object Closure extends App {
  def loopThrough(number: Int)(closure: Int ⇒ Unit) {
    for (i ← 1 to number) { closure(i) }
  }

  var result = 0
  val addIt = { value: Int ⇒ result += value }

  loopThrough(10) { elem ⇒ addIt(elem) }
  println(s"Total of values from 1 to 10 is $result")

  result = 0
  loopThrough(5) { addIt }
  println(s"Total of values from 1 to 5 is $result")

  var product = 1
  loopThrough(5) { product *= _ }
  println(s"Product of values from 1 to 5 is $product")

}
