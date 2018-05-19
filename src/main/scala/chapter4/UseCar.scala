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

package chapter4

object UseCar extends App {
  // #snip_4-2
  class Car(val year: Int) {
    private var milesDriven: Int = 0

    def miles: Int = milesDriven

    def drive(distance: Int): Unit = {
      milesDriven += Math.abs(distance)
    }
  }
  // #snip_4-2

  // #snip_4-3
  val car = new Car(2015)
  println(s"Car made in year ${car.year}")
  println(s"Miles driven ${car.miles}")
  println("Drive for 10 miles")
  car.drive(10)
  println(s"Miles driven ${car.miles}")
  // #snip_4-3

}
