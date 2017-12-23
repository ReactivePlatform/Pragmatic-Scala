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

package chapter5

object UsingEither extends App {
  // #snip_5-11
  def compute(input: Int) =
    if (input > 0)
      Right(math.sqrt(input))
    else
      Left("Error computing, invalid input")
  // #snip_5-11

  // #snip_5-12
  def displayResult(result: Either[String, Double]): Unit = {
    println(s"Raw: $result")
    result match {
      case Right(value) ⇒ println(s"result $value")
      case Left(err)    ⇒ println(s"Error: $err")
    }
  }
  // #snip_5-12

  // #snip_5-13
  displayResult(compute(4))
  displayResult(compute(-4))
  // #snip_5-13

}
