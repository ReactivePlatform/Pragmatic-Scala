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

package chapter12

object lazyCollection extends App {
  val people = List(("Mark", 32), ("Bob", 22), ("Jane", 8), ("Jill", 21),
    ("Nick", 50), ("Nancy", 42), ("Mike", 19), ("Sara", 12), ("Paula", 42),
    ("John", 21))

  def isOlderThan17(person: (String, Int)) = {
    println(s"isOlderThan17 called for $person")
    val (_, age) = person
    age > 17
  }

  def isNameStartsWithJ(person: (String, Int)) = {
    println(s"isNameStartsWithJ called for $person")
    val (name, _) = person
    name.startsWith("J")
  }

  // #snip
  println(people.view.filter { isOlderThan17 }.filter { isNameStartsWithJ }.head)
  // #snip

}
