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

package chapter11

object factorial extends App {
  // #snip_11-1
  def factorial(number: Int): BigInt = {
    if (number == 0)
      1
    else
      number * factorial(number - 1)
  }
  // #snip_11-1

  // #snip_11-2
  println(factorial(5))
  // #snip_11-2

  try {
    // #snip_11-3
    println(factorial(10000))
    // #snip_11-3
  } catch {
    case ex: Throwable ⇒ println(ex)
  }

}
