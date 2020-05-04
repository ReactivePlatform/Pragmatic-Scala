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

package chapter8

object Friends extends App {
  // #snip_8-33
  class Person(val firstName: String, val lastName: String)
  object Person {
    def apply(firstName: String, lastName: String): Person =
      new Person(firstName, lastName)
  }
  val friends =
    List(Person("Brian", "Sletten"), Person("Neal", "Ford"), Person("Scott", "Davis"), Person("Stuart", "Halloway"))

  val lastNames =
    for (friend <- friends; lastName = friend.lastName) yield lastName

  println(lastNames.mkString(", "))
  // #snip_8-33

}
