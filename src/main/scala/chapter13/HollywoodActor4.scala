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

import akka.actor._
import scala.collection.mutable._

case class Play(role: String)
case class ReportCount(role: String)

class HollywoodActor() extends Actor {
  val messagesCount : Map[String, Int] = Map()
  
  def receive = {
    case Play(role) => 
      val currentCount = messagesCount.getOrElse(role, 0)
      messagesCount.update(role, currentCount + 1)
      println(s"Playing $role")
    
    case ReportCount(role) => 
      sender ! messagesCount.getOrElse(role, 0)
  }
}
