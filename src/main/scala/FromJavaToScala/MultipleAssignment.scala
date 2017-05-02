/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def getPersonInfo(primaryKey : Int) = { 
  // Assume primaryKey is used to fetch a person's info... 
  // Here response is hard-coded
  ("Venkat", "Subramaniam", "venkats@agiledeveloper.com") 
}

val (firstName, lastName, emailAddress) = getPersonInfo(1)

println(s"First Name: $firstName")
println(s"Last Name: $lastName")
println(s"Email Address: $emailAddress")