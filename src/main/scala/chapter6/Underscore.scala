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

val arr = Array(1, 2, 3, 4, 5)

val total = (0 /: arr) { (sum, elem) ⇒ sum + elem }
println(s"Sum of all values in array is $total")

{
  val total = (0 /: arr) { _ + _ }
}
println(s"Sum of all values in array is $total")

val negativeNumberExists1 = arr.exists { elem ⇒ elem < 0 }
val negativeNumberExists2 = arr.exists { _ < 0 }
println(s"Array has negative number? $negativeNumberExists1")
println(s"Array has negative number? $negativeNumberExists2")
