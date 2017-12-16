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

// #snip_8-25
class Cow {
  def ^(moon: Moon): Unit = println("Cow jumped over the moon")
}
class Moon {
  def ^:(cow: Cow): Unit = println("This cow jumped over the moon too")
}
// #snip_8-25

// #snip_8-26
val cow = new Cow
val moon = new Moon

cow ^ moon
cow ^: moon
// #snip_8-26
