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

package chapter4

object Person extends App {
  // #snip
  class Person(val firstName: String, val lastName: String) {
    var position: String = _

    println(s"Creating $toString")

    def this(firstName: String, lastName: String, positionHeld: String) {
      this(firstName, lastName)
      position = positionHeld
    }
    override def toString: String = {
      s"$firstName $lastName holds $position position"
    }
  }

  val john = new Person("John", "Smith", "Analyst")
  println(john)
  val bill = new Person("Bill", "Walker")
  println(bill)
  // #snip

}
