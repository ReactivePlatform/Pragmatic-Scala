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

object DateHelper1 extends App {
  // #snip_5-24
  import scala.language.implicitConversions
  import java.time.LocalDate

  class DateHelper(offset: Int) {
    def days(when: String): LocalDate = {
      val today = LocalDate.now
      when match {
        case "ago" => today.minusDays(offset)
        case "from_now" => today.plusDays(offset)
        case _ => today
      }
    }
  }
  // #snip_5-24

  // #snip_5-25
  implicit def convertInt2DateHelper(offset: Int): DateHelper = new DateHelper(offset)

  val ago = "ago"
  val from_now = "from_now"

  val past = 2.days(ago)
  val appointment = 5.days(from_now)

  println(past)
  println(appointment)
  // #snip_5-25
}
