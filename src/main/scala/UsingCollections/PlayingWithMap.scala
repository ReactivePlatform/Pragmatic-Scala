/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_8-8
val feeds = Map("Andy Hunt"   -> "blog.toolshed.com",
                "Dave Thomas" -> "pragdave.me",
                "NFJS"        -> "nofluffjuststuff.com/blog")
// #snip_8-8

// #snip_8-9
val filterNameStartWithD = feeds filterKeys( _ startsWith "D" )
println(s"# of Filtered: ${filterNameStartWithD.size}")
// #snip_8-9

// #snip_8-10
val filterNameStartWithDAndPragprogInFeed = feeds filter { element => 
  val (key, value) = element
  (key startsWith "D") && (value contains "pragprog")
}
print("# of feeds with auth name D* and pragprog in URL: ")
println(filterNameStartWithDAndPragprogInFeed.size)
// #snip_8-10

// #snip_8-11
println(s"Get Andy's Feed: ${feeds.get("Andy Hunt")}")
println(s"Get Bill's Feed: ${feeds.get("Bill Who")}")
// #snip_8-11

// #snip_8-12
try {
  println(s"Get Andy's Feed Using apply(): ${feeds("Andy Hunt")}")
  print("Get Bill's Feed: ")
  println(feeds("Bill Who"))
}
catch {
  case _ : java.util.NoSuchElementException => println("Not found")
}
// #snip_8-12

// #snip_8-13
val newFeeds1 = feeds.updated("Venkat Subramaniam", "blog.agiledeveloper.com")
println("Venkat's blog in original feeds: " + feeds.get("Venkat Subramaniam"))
println("Venkat's blog in new feed: " + newFeeds1("Venkat Subramaniam"))
// #snip_8-13

// #snip_8-14
val mutableFeeds = scala.collection.mutable.Map(
    "Scala Book Forum" -> "forums.pragprog.com/forums/87")
mutableFeeds("Groovy Book Forum") = "forums.pragprog.com/forums/246"
println(s"Number of forums: ${mutableFeeds.size}")
// #snip_8-14
