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

object Extractor1 extends App {
  // #snip_9-15
  object StockService {
    def process(input: String) {
      input match {
        case Symbol() ⇒ println(s"Look up price for valid symbol $input")
        case _        ⇒ println(s"Invalid input $input")
      }
    }
  }
  // #snip_9-15

  // #snip_9-16
  object Symbol {
    def unapply(symbol: String): Boolean = {
      // you'd look up a database... here only GOOG and IBM are recognized
      symbol == "GOOG" || symbol == "IBM"
    }
  }
  // #snip_9-16

  // #snip_9-14
  StockService process "GOOG"
  StockService process "IBM"
  StockService process "ERR"
  // #snip_9-14

}
