/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def commentOnPractice(input: String) = {
  //rather than returning null
  if (input == "test") Some("good") else None
}

for (input <- Set("test", "hack")) {
  val comment = commentOnPractice(input)
  val commentDisplay = comment.getOrElse("Found no comments")
  println(s"input: $input comment: $commentDisplay")  
}
