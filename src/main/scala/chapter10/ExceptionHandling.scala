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

import chapter10.Tax

// #snip
for (amount <- List(100.0, 0.009, -2.0, 1000001.0)) {
  try {
    print(s"Amount: $$$amount ")
    println(s"Tax: $$${Tax.taxFor(amount)}")
  }
  catch {
    case ex: IllegalArgumentException => println(ex.getMessage)
    case ex: RuntimeException =>
      // if you need a block of code to handle exception
      println(s"Don't bother reporting...${ex.getMessage}")
  }
}
// #snip