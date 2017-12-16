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

// #snip_9-24
def process(input: String) {
  val GoogStock = """^GOOG:(\d*\.\d+)""".r
  input match {
    case GoogStock(price) ⇒ println(s"Price of GOOG is $$$price")
    case _                ⇒ println(s"not processing $input")
  }
}
process("GOOG:310.84")
process("GOOG:310")
process("IBM:84.01")
// #snip_9-24
