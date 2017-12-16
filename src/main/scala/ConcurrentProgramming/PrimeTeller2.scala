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

def isPrime(number: Int) = { 
  println("Going to find if " + number + " is prime")

  var result = true

  if (number > 1 && number < 4) result = true
              
  for (i <- 2 to Math.sqrt(number.toDouble).floor.toInt; if result) {               
    if (number % i == 0) result = false
  }
                              
  println("done finding if " + number + " is prime")                              
  result
}

val primeTeller = actor {
  var continue = true
  
  while (continue) {
    receive {
    //case (caller : Actor, number: Int) => caller ! (number, isPrime(number))
    case (caller : Actor, number: Int) => actor { caller ! (number, isPrime(number)) }
      case "quit" => continue = false
    }
  }
}

primeTeller ! (self, 2)
primeTeller ! (self, 131)
primeTeller ! (self, 132)

for (i <- 1 to 3) {
  receive {
    case (number, result) => println(number + " is prime? " + result)
  }
}

primeTeller ! "quit"
