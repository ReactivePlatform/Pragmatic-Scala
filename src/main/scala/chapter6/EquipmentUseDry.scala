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

package chapter6

object EquipmentUseDry extends App {
  val calculator = { input: Int ⇒ println(s"calc with $input"); input }

  val equipment1 = new Equipment(calculator)
  val equipment2 = new Equipment(calculator)

  equipment1.simulate(4)
  equipment2.simulate(6)
}
