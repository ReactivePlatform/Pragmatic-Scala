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

package chapter6

object Inject extends App {
  // #snip_6-7
  def inject(arr: Array[Int], initial: Int, operation: (Int, Int) ⇒ Int) = {
    var carryOver = initial
    arr.foreach(element ⇒ carryOver = operation(carryOver, element))
    carryOver
  }
  // #snip_6-7

  // #snip_6-8
  val array = Array(2, 3, 5, 1, 6, 4)
  val sum = inject(array, 0, (carry, elem) ⇒ carry + elem)
  println(s"Sum of elements in array is $sum")
  // #snip_6-8

  // #snip_6-9
  val max =
    inject(array, Integer.MIN_VALUE, (carry, elem) ⇒ Math.max(carry, elem))
  println(s"Max of elements in array is  $max")
  // #snip_6-9

}
