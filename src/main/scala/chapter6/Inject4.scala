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

object Inject4 {
  // #snip_6-14
  def inject(arr: Array[Int], initial: Int)(operation: (Int, Int) ⇒ Int): Int = {
    var carryOver = initial
    arr.foreach(element ⇒ carryOver = operation(carryOver, element))
    carryOver
  }
  // #snip_6-14

  val array = Array(2, 3, 5, 1, 6, 4)

  // #snip_6-15
  val sum: Int = inject(array, 0) { (carryOver, elem) ⇒ carryOver + elem }
  // #snip_6-15

  println(s"Sum of elements in array ${array.toString} is $sum")

}
