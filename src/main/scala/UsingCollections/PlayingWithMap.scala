/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val feeds = Map("Andy Hunt"   -> "blog.toolshed.com",
                "Dave Thomas" -> "pragdave.me",
                "NFJS"        -> "nofluffjuststuff.com/blog")

println("/" + "/" + "START:FILTER_OUTPUT")
val filterNameStartWithD = feeds filterKeys( _ startsWith "D" )
println(s"# of Filtered: ${filterNameStartWithD.size}")
println("/" + "/" + "END:FILTER_OUTPUT")

println("/" + "/" + "START:FILTER2_OUTPUT")
val filterNameStartWithDAndPragprogInFeed = feeds filter { element => 
  val (key, value) = element
  (key startsWith "D") && (value contains "pragprog")
}
print("# of feeds with auth name D* and pragprog in URL: ")
println(filterNameStartWithDAndPragprogInFeed.size)
println("/" + "/" + "END:FILTER2_OUTPUT")

println("/" + "/" + "START:GET_OUTPUT")
println(s"Get Andy's Feed: ${feeds.get("Andy Hunt")}")
println(s"Get Bill's Feed: ${feeds.get("Bill Who")}")
println("/" + "/" + "END:GET_OUTPUT")

println("/" + "/" + "START:APPLY_OUTPUT")
try {
  println(s"Get Andy's Feed Using apply(): ${feeds("Andy Hunt")}")
  print("Get Bill's Feed: ")
  println(feeds("Bill Who"))
}
catch {
  case ex : java.util.NoSuchElementException => println("Not found")
}
println("/" + "/" + "END:APPLY_OUTPUT")

println("/" + "/" + "START:UPDATE_OUTPUT")
val newFeeds1 = feeds.updated("Venkat Subramaniam", "blog.agiledeveloper.com")
println("Venkat's blog in original feeds: " + feeds.get("Venkat Subramaniam"))
println("Venkat's blog in new feed: " + newFeeds1("Venkat Subramaniam"))
println("/" + "/" + "END:UPDATE_OUTPUT")

println("/" + "/" + "START:UPDATE2_OUTPUT")
val mutableFeeds = scala.collection.mutable.Map(
    "Scala Book Forum" -> "forums.pragprog.com/forums/87")
mutableFeeds("Groovy Book Forum") = "forums.pragprog.com/forums/246"
println(s"Number of forums: ${mutableFeeds.size}")
println("/" + "/" + "END:UPDATE2_OUTPUT")
