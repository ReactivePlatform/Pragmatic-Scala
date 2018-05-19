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

package chapter5

object PlayWithPets extends App {
  // #snip_5-18
  class Pet(val name: String) {
    override def toString: String = name
  }

  class Dog(override val name: String) extends Pet(name)

  def workWithPets(pets: Array[Pet]): Unit = {}
  // #snip_5-18

  // #snip_5-19
  val dogs = Array(new Dog("Rover"), new Dog("Comet"))
  // #snip_5-19

  //  workWithPets(dogs) // Compilation ERROR

  // #snip_5-20
  def playWithPets[T <: Pet](pets: Array[T]): Unit =
    println("Playing with pets: " + pets.mkString(", "))
  // #snip_5-20

  // #snip_5-21
  playWithPets(dogs)
  // #snip_5-21

  // #snip_5-22
  def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]): Unit = { //...
  }

  val pets = new Array[Pet](10)
  copyPets(dogs, pets)
  // #snip_5-22

}
