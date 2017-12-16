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

// #snip_8-15
val feeds = List("blog.toolshed.com", "pragdave.me", "blog.agiledeveloper.com")
// #snip_8-15

// #snip_8-16
println(s"First feed: ${feeds.head}")
println(s"Second feed: ${feeds(1)}")
// #snip_8-16

// #snip_8-17
val prefixedList = "forums.pragprog.com/forums/87" :: feeds
println(s"First Feed In Prefixed: ${prefixedList.head}")
// #snip_8-17

// #snip_8-18
val feedsWithForums =
  feeds ::: List(
    "forums.pragprog.com/forums/87",
    "forums.pragprog.com/forums/246")
println(s"First feed in feeds with forum: ${feedsWithForums.head}")
println(s"Last feed in feeds with forum: ${feedsWithForums.last}")
// #snip_8-18

// #snip_8-19
val appendedList = feeds ::: List("agilelearner.com")
println(s"Last Feed In Appended: ${appendedList.last}")
// #snip_8-19

// #snip_8-20
println(s"Feeds with blog: ${feeds.filter(_ contains "blog").mkString(", ")}")
println(s"All feeds have com: ${feeds.forall(_ contains "com")}")
println(s"All feeds have dave: ${feeds.forall(_ contains "dave")}")
println(s"Any feed has dave: ${feeds.exists(_ contains "dave")}")
println(s"Any feed has bill: ${feeds.exists(_ contains "bill")}")
// #snip_8-20

// #snip_8-21
println(s"Feed url lengths: ${feeds.map(_.length).mkString(", ")}")
// #snip_8-21

// #snip_8-22
val total = feeds.foldLeft(0) { (total, feed) ⇒ total + feed.length }
println(s"Total length of feed urls: $total")
// #snip_8-22

// #snip_8-23
val total2 = (0 /: feeds) { (total, feed) ⇒ total + feed.length }
println(s"Total length of feed urls: $total2")
// #snip_8-23

// #snip_8-24
val total3 = (0 /: feeds) { _ + _.length }
println(s"Total length of feed urls: $total3")
// #snip_8-24
