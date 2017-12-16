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

val array = Array(2, 3, 5, 1, 6, 4)

val sum = array.foldLeft(0) { (sum, elem) ⇒ sum + elem }
val max = array.foldLeft(Integer.MIN_VALUE) { (large, elem) ⇒
  Math.max(large, elem)
}

println(s"Sum of elements in array is $sum")
println(s"Max of elements in array is $max")

{
  val sum = (0 /: array) { (sum, elem) ⇒ sum + elem }
  val max =
    (Integer.MIN_VALUE /: array) { (large, elem) ⇒ Math.max(large, elem) }

  println(s"Sum of elements in array ${array.toString} is $sum")
  println(s"Max of elements in array ${array.toString} is $max")
}
