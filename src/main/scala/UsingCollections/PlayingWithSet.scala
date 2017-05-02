/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val feeds1 = Set("blog.toolshed.com", "pragdave.me", "blog.agiledeveloper.com")
val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")

println("/" + "/" + "START:FILTER_OUTPUT")
val blogFeeds = feeds1 filter ( _ contains "blog" )
println(s"blog feeds: ${blogFeeds.mkString(", ")}")
println("/" + "/" + "END:FILTER_OUTPUT")

println("/" + "/" + "START:MERGE_OUTPUT")
val mergedFeeds = feeds1 ++ feeds2
println(s"# of merged feeds: ${mergedFeeds.size}")
println("/" + "/" + "END:MERGE_OUTPUT")
            
println("/" + "/" + "START:INTERSECT_OUTPUT")
val commonFeeds = feeds1 & feeds2
println(s"common feeds: ${commonFeeds.mkString(", ")}")
println("/" + "/" + "END:INTERSECT_OUTPUT")

println("/" + "/" + "START:MAP_OUTPUT")
val urls = feeds1 map ( "http://" + _ )
println(s"One url: ${urls.head}")
println("/" + "/" + "END:MAP_OUTPUT")

println("/" + "/" + "START:FOREACH_OUTPUT")
println("Refresh Feeds:")
feeds1 foreach { feed => println(s"  Refreshing $feed...") }
println("/" + "/" + "END:FOREACH_OUTPUT")
