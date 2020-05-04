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

object RouteParams extends App {
  val arr = Array(1, 2, 3, 4, 5)

  // #snip_6-19
  val largest =
    (Integer.MIN_VALUE /: arr) { (carry, elem) =>
      Math.max(carry, elem)
    }
  // #snip_6-19

  println(largest)

  {
    // #snip_6-20
    val largest = (Integer.MIN_VALUE /: arr) { Math.max(_, _) }
    // #snip_6-20

    println(largest)
  }

  {
    // #snip_6-21
    val largest = (Integer.MIN_VALUE /: arr) { Math.max _ }
    // #snip_6-21

    println(largest)
  }

  {
    // #snip_6-22
    val largest = (Integer.MIN_VALUE /: arr) { Math.max }
    // #snip_6-22

    println(largest)
  }

}
