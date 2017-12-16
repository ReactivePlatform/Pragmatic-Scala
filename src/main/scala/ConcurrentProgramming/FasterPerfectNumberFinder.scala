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
def sumOfFactorsInRange(lower: Int, upper: Int, number: Int) = {
  (0 /: (lower to upper)) { (sum, i) => if (number % i == 0) sum + i else sum }
}

def isPerfectConcurrent(candidate: Int) = {
  val RANGE = 1000000
  val numberOfPartitions = (candidate.toDouble / RANGE).ceil.toInt
  val caller = self
  
  for (i <- 0 until numberOfPartitions) { 
    val lower = i * RANGE + 1;
    val upper = candidate min (i + 1) * RANGE
    actor { 
      caller ! sumOfFactorsInRange(lower, upper, candidate) 
    }
  }
     
  val sum = (0 /: (0 until numberOfPartitions)) { (partialSum, i) =>
    receive { 
      case sumInRange : Int => partialSum + sumInRange
    }
  }
             
  2 * candidate == sum
}

println("6 is perfect? " + isPerfectConcurrent(6))
println("33550336 is perfect? " + isPerfectConcurrent(33550336))
println("33550337 is perfect? " + isPerfectConcurrent(33550337))
