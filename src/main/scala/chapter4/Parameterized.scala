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

package chapter4

object Parameterized extends App {
  // #snip_4-10
  def echo[T](input1: T, input2: T): Unit =
    println(s"got $input1 (${input1.getClass}) $input2 (${input2.getClass})")
  // #snip_4-10

  // #snip_4-11
  echo("hello", "there")
  echo(4, 5)
  // #snip_4-11

  // #snip_4-12
  echo("hi", 5)
  // #snip_4-12

  // #snip_4-14
  def echo2[T1, T2](input1: T1, input2: T2): Unit =
    println(s"received $input1 and $input2")

  echo2("Hi", "5")
  // #snip_4-14

  // #snip_4-15
  class Message[T](val content: T) {
    override def toString = s"message content is $content"

    def is(value: T): Boolean = value == content
  }
  // #snip_4-15

  // #snip_4-16
  val message1: Message[String] = new Message("howdy")
  val message2 = new Message(42)

  println(message1)
  println(message1.is("howdy"))
  println(message1.is("hi"))
  println(message2.is(22))
  // #snip_4-16

}
