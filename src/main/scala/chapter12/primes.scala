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

package chapter12

object primes extends App {
  // #snip_12-10
  def isDivisibleBy(number: Int, divisor: Int) = number % divisor == 0

  def isPrime(number: Int) =
    number > 1 && !(2 until number).exists { isDivisibleBy(number, _) }

  def primes(starting: Int): Stream[Int] = {
    println(s"computing for $starting")
    if (isPrime(starting))
      starting #:: primes(starting + 1)
    else
      primes(starting + 1)
  }
  // #snip_12-10

  // #snip_12-11
  val primesFrom100 = primes(100)

  println(primesFrom100.take(3).toList)
  println("Let's ask for more...")
  println(primesFrom100.take(4).toList)
  // #snip_12-11

}
