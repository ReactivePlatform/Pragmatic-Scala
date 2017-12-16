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

package chapter8

object PowerOfFor extends App {
  // #snip_8-28
  for (_ ← 1 to 3) { print("ho ") }
  // #snip_8-28

  // #snip_8-29
  val result = for (i ← 1 to 10)
    yield i * 2
  // #snip_8-29

  // #snip_8-30
  val result2 = (1 to 10).map(_ * 2)
  // #snip_8-30

  // #snip_8-31
  val doubleEven = for (i ← 1 to 10; if i % 2 == 0)
    yield i * 2
  // #snip_8-31

  // #snip_8-32
  for {
    i ← 1 to 10
    if i % 2 == 0
  } yield i * 2
  // #snip_8-32

  println(result)
  println(doubleEven)
  println(result2)

}
