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

package chapter5

object Err extends App {
  import scala.language.implicitConversions

  class One(val number: Int) {
    def foo = "one"
  }

  class Two(val number: Int) {
    def foo = "two"
  }

  implicit def convertIntToOne(number: Int): One = new One(number)
  implicit def convertIntToTwo(number: Int): Two = new Two(number)

  println(2.foo) //Error
  println(2.foo) //Error

}
