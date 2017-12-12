package UsingTraits

/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/

// #snip
object UseFriend extends App {
  val john = new Man("John")
  val sara = new Woman("Sara")
  val comet = new Dog("Comet")

  john.listen()
  sara.listen()
  comet.listen()

  val mansBestFriend : Friend = comet
  mansBestFriend.listen()

  def helpAsFriend(friend: Friend): Unit = friend.listen()

  helpAsFriend(sara)
  helpAsFriend(comet)  
}
// #snip
