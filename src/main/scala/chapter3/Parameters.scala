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

package chapter3

object Parameters extends App {
  // #snip_3-8
  def max(values: Int*) = values.foldLeft(values(0)) { Math.max }
  // #snip_3-8

  println(
    // #snip_3-9
    max(8, 2, 3)
  // #snip_3-9
  )

  println(
    // #snip_3-10
    max(2, 5, 3, 7, 1, 6)
  // #snip_3-10
  )

  // #snip_3-13
  val numbers = Array(2, 5, 3, 7, 1, 6)
  max(numbers: _*)
  // #snip_3-13

}
