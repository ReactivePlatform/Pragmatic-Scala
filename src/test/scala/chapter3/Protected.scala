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

package chapter3

object Protected extends App {
  // #snip
  class Vehicle {
    protected def checkEngine() {}
  }

  class Car extends Vehicle {
    def start() { checkEngine() /*OK*/ }
    def tow(car: Car) {
      car.checkEngine() //OK
    }
    def tow(vehicle: Vehicle) {
      vehicle.checkEngine() //ERROR
    }
  }

  class GasStation {
    def fillGas(vehicle: Vehicle) {
      vehicle.checkEngine() //ERROR
    }
  }
  // #snip
}
