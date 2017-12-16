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

def sumOfFactors(number: Int) = {
  (0 /: (1 to number)) { (sum, i) => if (number % i == 0) sum + i else sum }
}
def isPerfect(candidate: Int) = 2 * candidate == sumOfFactors(candidate)

println("6 is perfect? " + isPerfect(6))
println("33550336 is perfect? " + isPerfect(33550336))
println("33550337 is perfect? " + isPerfect(33550337))
