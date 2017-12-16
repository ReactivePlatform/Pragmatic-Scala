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

// #snip_8-2
val feeds1 = Set("blog.toolshed.com", "pragdave.me", "blog.agiledeveloper.com")
val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")
// #snip_8-2

// #snip_8-3
val blogFeeds = feeds1 filter ( _ contains "blog" )
println(s"blog feeds: ${blogFeeds.mkString(", ")}")
// #snip_8-3

// #snip_8-4
val mergedFeeds = feeds1 ++ feeds2
println(s"# of merged feeds: ${mergedFeeds.size}")
// #snip_8-4

// #snip_8-5
val commonFeeds = feeds1 & feeds2
println(s"common feeds: ${commonFeeds.mkString(", ")}")
// #snip_8-5

// #snip_8-6
val urls = feeds1 map ( "http://" + _ )
println(s"One url: ${urls.head}")
// #snip_8-6

// #snip_8-7
println("Refresh Feeds:")
feeds1 foreach { feed => println(s"  Refreshing $feed...") }
// #snip_8-7
