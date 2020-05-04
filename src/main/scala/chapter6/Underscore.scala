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

object Underscore extends App {
  // #snip_6-16
  val arr = Array(1, 2, 3, 4, 5)

  val total = arr.foldLeft(0) { (sum, elem) =>
    sum + elem
  }
  // #snip_6-16

  println(s"Sum of all values in array is $total")

  {
    // #snip_6-17
    val total = arr.foldLeft(0) { _ + _ }
    // #snip_6-17

  }
  println(s"Sum of all values in array is $total")

  // #snip_6-18
  val negativeNumberExists1 = arr.exists { elem =>
    elem < 0
  }
  val negativeNumberExists2 = arr.exists { _ < 0 }
  // #snip_6-18

  println(s"Array has negative number? $negativeNumberExists1")
  println(s"Array has negative number? $negativeNumberExists2")

}
