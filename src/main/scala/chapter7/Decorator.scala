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

package chapter7

object Decorator extends App {
  // #snip_1
  abstract class Check {
    def check: String = "Checked Application Details..."
  }
  // #snip_1

  // #snip_2
  trait CreditCheck extends Check {
    override def check: String = s"Checked Credit... ${super.check}"
  }

  trait EmploymentCheck extends Check {
    override def check: String = s"Checked Employment...${super.check}"
  }

  trait CriminalRecordCheck extends Check {
    override def check: String = s"Check Criminal Records...${super.check}"
  }
  // #snip_2

  // #snip_3
  val apartmentApplication =
    new Check with CreditCheck with CriminalRecordCheck

  println(apartmentApplication.check)
  // #snip_3

  // #snip_4
  val employmentApplication =
    new Check with CriminalRecordCheck with EmploymentCheck

  println(employmentApplication.check)
  // #snip_4

}
