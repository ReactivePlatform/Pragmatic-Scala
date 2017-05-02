/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val feeds = List("blog.toolshed.com", "pragdave.me", "blog.agiledeveloper.com")

println("/" + "/" + "START:GET_OUTPUT")
println(s"First feed: ${feeds.head}")
println(s"Second feed: ${feeds(1)}")
println("/" + "/" + "END:GET_OUTPUT")

println("/" + "/" + "START:PREFIX_OUTPUT")
val prefixedList = "forums.pragprog.com/forums/87" :: feeds
println(s"First Feed In Prefixed: ${prefixedList.head}")
println("/" + "/" + "END:PREFIX_OUTPUT")

println("/" + "/" + "START:PREFIXLIST_OUTPUT")
val feedsWithForums = 
  feeds ::: List("forums.pragprog.com/forums/87", 
    "forums.pragprog.com/forums/246")
println(s"First feed in feeds with forum: ${feedsWithForums.head}")
println(s"Last feed in feeds with forum: ${feedsWithForums.last}")
println("/" + "/" + "END:PREFIXLIST_OUTPUT")

println("/" + "/" + "START:APPEND_OUTPUT")
val appendedList = feeds ::: List("agilelearner.com")
println(s"Last Feed In Appended: ${appendedList.last}")
println("/" + "/" + "END:APPEND_OUTPUT")

println("/" + "/" + "START:FILTER_EXIST_FORALL_OUTPUT")
println(s"Feeds with blog: ${feeds.filter( _ contains "blog" ).mkString(", ")}")
println(s"All feeds have com: ${feeds.forall( _ contains "com" )}")
println(s"All feeds have dave: ${feeds.forall( _ contains "dave" )}")
println(s"Any feed has dave: ${feeds.exists( _ contains "dave" )}")
println(s"Any feed has bill: ${feeds.exists( _ contains "bill" )}")
println("/" + "/" + "END:FILTER_EXIST_FORALL_OUTPUT")

println("/" + "/" + "START:MAP_OUTPUT")
println(s"Feed url lengths: ${feeds.map( _.length ).mkString(", ")}")
println("/" + "/" + "END:MAP_OUTPUT")

println("/" + "/" + "START:FOLDLEFT_OUTPUT")
val total = feeds.foldLeft(0) { (total, feed) => total + feed.length }
println(s"Total length of feed urls: $total")
println("/" + "/" + "END:FOLDLEFT_OUTPUT")

println("/" + "/" + "START:FOLDLEFT2_OUTPUT")
val total2 = (0 /: feeds) { (total, feed) => total + feed.length }
println(s"Total length of feed urls: $total2")
println("/" + "/" + "END:FOLDLEFT2_OUTPUT")

println("/" + "/" + "START:FOLDLEFT3_OUTPUT")
val total3 = (0 /: feeds) { _ + _.length }
println(s"Total length of feed urls: $total3")
println("/" + "/" + "END:FOLDLEFT3_OUTPUT")
