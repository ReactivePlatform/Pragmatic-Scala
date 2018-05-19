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

package chapter9

object MatchTypes extends App {
  // #snip
  def process(input: Any): Unit = {
    input match {
      case (_: Int, _: Int)          ⇒ print("Processing (int, int)... ")
      case (_: Double, _: Double)    ⇒ print("Processing (double, double)... ")
      case msg: Int if msg > 1000000 ⇒ println("Processing int > 1000000")
      case _: Int                    ⇒ print("Processing int... ")
      case _: String                 ⇒ println("Processing string... ")
      case _                         ⇒ printf(s"Can't handle $input... ")
    }
  }

  process((34.2, -159.3))
  process(0)
  process(1000001)
  process(2.2)
  // #snip

}
