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

package chapter7

// #snip
object UseFriend extends App {
  val john = new Man("John")
  val sara = new Woman("Sara")
  val comet = new Dog("Comet")

  john.listen()
  sara.listen()
  comet.listen()

  val mansBestFriend: Friend = comet
  mansBestFriend.listen()

  def helpAsFriend(friend: Friend): Unit = friend.listen()

  helpAsFriend(sara)
  helpAsFriend(comet)
}
// #snip
