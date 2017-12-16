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

import scala.actors._
import Actor._
val expectStringOrInteger = actor {
  for(i <- 1 to 4) {
    receiveWithin(1000) {
      case str : String => println("You said " + str)
      case num : Int => println("You gave " + num)
      case TIMEOUT => println("Timed out!")
    }
  }
}

expectStringOrInteger ! "only constant is change"
expectStringOrInteger ! 1024
expectStringOrInteger ! 22.22
expectStringOrInteger ! (self, 1024)

receiveWithin(3000) { case _ => }
