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

import scala.actors.Actor._
def info(msg: String) = println(msg + " received by " + Thread.currentThread())
def receiveMessage(id : Int) {
  for(i <- 1 to 2) {
      receiveWithin(20000) { 
        case msg : String => info("receive: " + id + msg) }
  }
}
def reactMessage(id : Int) {              
  react {
    case msg : String => info("react:   " + id + msg)
    reactMessage(id)
  }
}
val actors = Array(
  actor { info("react:   1 actor created"); reactMessage(1) },
  actor { info("react:   2 actor created"); reactMessage(2) },
  actor { info("receive: 3 actor created"); receiveMessage(3) },
  actor { info("receive: 4 actor created"); receiveMessage(4) }
  ) 
Thread.sleep(1000)               
for(i <- 0 to 3) { actors(i) ! " hello"; Thread.sleep(2000) }
Thread.sleep(2000)
for(i <- 0 to 3) { actors(i) ! " hello"; Thread.sleep(2000) }
