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

object MatchWithValsOK extends App {
  // #snip
  class Sample {
    val MAX = 100

    def process(input: Int): Unit = {
      input match {
        case MAX => println("You matched max")
      }
    }
  }

  val sample = new Sample
  try {
    sample.process(0)
  } catch {
    case ex: Throwable => println(ex)
  }
  sample.process(100)
  // #snip

}
