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

// #snip_9-21
val pattern = "(S|s)cala".r
val str = "Scala is scalable and cool"
println(pattern findFirstIn str)
// #snip_9-21

// #snip_9-22
println((pattern findAllIn str).mkString(", "))
// #snip_9-22

// #snip_9-23
println("cool".r replaceFirstIn (str, "awesome"))
// #snip_9-23
