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

package chapter9

object MatchUsingRegex2 extends App {
  // #snip_9-25
  def process(input: String) {
    val MatchStock = """^(.+):(\d*\.\d+)""".r
    input match {
      case MatchStock("GOOG", price) ⇒ println(s"We got GOOG at $$$price")
      case MatchStock("IBM", price)  ⇒ println(s"IBM's trading at $$$price")
      case MatchStock(symbol, price) ⇒ println(s"Price of $symbol is $$$price")
      case _                         ⇒ println(s"not processing $input")
    }
  }
  process("GOOG:310.84")
  process("IBM:84.01")
  process("GE:15.96")
  // #snip_9-25

}
