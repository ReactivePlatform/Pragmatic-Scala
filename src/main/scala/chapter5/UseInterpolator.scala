/*
 * Copyright 2018 pragmatic-scala.reactiveplatform.xyz
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

package chapter5

object UseInterpolator extends App {
  // #snip
  import MyInterpolator._

  val ssn = "123-45-6789"
  val account = "0246781263"
  val balance = 20145.23

  println(mask"""Account: $account
    |Social Security Number: $ssn
    |Balance: $$^$balance
    |Thanks for your business.""".stripMargin)
  // #snip

}
