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

class Message[T](val content: T) {
  override def toString = s"message content is $content"

  def is(value: T) = value == content
}

val message1: Message[String] = new Message("howdy")
val message2 = new Message(42)

message1.is(22) //error: type mismatch

message2.is('A') //No error!
