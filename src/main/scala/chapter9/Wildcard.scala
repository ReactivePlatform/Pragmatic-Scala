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

// #snip
object DayOfWeek extends Enumeration {
  val SUNDAY = Value("Sunday")
  val MONDAY = Value("Monday")
  val TUESDAY = Value("Tuesday")
  val WEDNESDAY = Value("Wednesday")
  val THURSDAY = Value("Thursday")
  val FRIDAY = Value("Friday")
  val SATURDAY = Value("Saturday")
}

def activity(day: DayOfWeek.Value) {
  day match {
    case DayOfWeek.SUNDAY   ⇒ println("Eat, sleep, repeat...")
    case DayOfWeek.SATURDAY ⇒ println("Hang out with friends")
    case _                  ⇒ println("...code for fun...")
  }
}

activity(DayOfWeek.SATURDAY)
activity(DayOfWeek.MONDAY)
// #snip
