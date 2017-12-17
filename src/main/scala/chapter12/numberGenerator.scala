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

package chapter12

object numberGenerator extends App {
  // #snip
  def generate(starting: Int): Stream[Int] = {
    starting #:: generate(starting + 1)
  }

  println(generate(25))
  // #snip

  // #snip_12-8
  println(generate(25).take(10).force)
  println(generate(25).take(10).toList)
  // #snip_12-8

  // #snip_12-9
  println(generate(25).takeWhile { _ < 40 }.force)
  // #snip_12-9

}
