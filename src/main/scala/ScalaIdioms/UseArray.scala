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

val arr1 = new Array[int](3)
arr1(0) = 1
arr1(1) = 2
arr1(2) = 3

val arr2 = Array(1, 2, 3)

val arr3 = Array("one", "two", "three")
     
println(arr1.getClass())
println(arr2.getClass())
println(arr3.getClass())
