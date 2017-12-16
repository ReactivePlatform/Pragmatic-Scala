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
val fortuneTeller = actor {
  for (i <- 1 to 4) {
    Thread.sleep(1000)
    receive {                                    
      case _ => sender ! "your day will rock! " + i
      //case _ => reply("your day will rock! " + i) // same as above
    }
  }
}                 
  
println( fortuneTeller !? (2000, "what's ahead") )
println( fortuneTeller !? (500, "what's ahead") )
val aPrinter = actor {
  receive { case msg => println("Ah, fortune message for you-" + msg) }
}                                                            

fortuneTeller.send("What's up", aPrinter)
fortuneTeller ! "How's my future?"
Thread.sleep(3000)
receive { case msg : String => println("Received " + msg ) }
println("Let's get that lost message")
receive { case !(channel, msg) => println("Received belated message " + msg) }
