/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
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
