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

class AnsweringService(val folks: String*) extends Actor {
  def act() {
    while(true) {
      receive {
        case (caller : Actor, name : String, msg : String) => 
          caller ! (
          if(folks.contains(name)) 
            String.format("Hey it's %s got message %s", name,  msg)
          else 
            String.format("Hey there's no one with the name %s here", name)
          )    
         case "ping" => println("ping!")
         case "quit" => println("exiting actor")
           exit
      }
    }
  }
}

val answeringService1 = new AnsweringService("Sara", "Kara", "John")
answeringService1 ! (self, "Sara", "In town")
answeringService1 ! (self, "Kara", "Go shopping?")

answeringService1.start()

answeringService1 ! (self, "John", "Bug fixed?")
answeringService1 ! (self, "Bill", "What's up")

for(i <- 1 to 4) { receive { case msg => println(msg) }  }
                 
answeringService1 ! "ping"
answeringService1 ! "quit"                    
answeringService1 ! "ping"
                         
Thread.sleep(2000)
println("The last ping was not processed")
