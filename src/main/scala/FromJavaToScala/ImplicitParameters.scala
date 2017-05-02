/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Wifi(name: String) {
  override def toString = name
}

def connectToNetwork(user: String)(implicit wifi: Wifi) {
  println(s"User: $user connected to WIFI $wifi")
}

def atOffice() = {
  println("--- at the office ---")
  implicit def officeNetwork = new Wifi("office-network")
  val cafeteriaNetwork = new Wifi("cafe-connect")
  
  connectToNetwork("guest")(cafeteriaNetwork)
  connectToNetwork("Jill Coder")
  connectToNetwork("Joe Hacker")
}

def atJoesHome() = {
  println("--- at Joe's home ---")
  implicit def homeNetwork = new Wifi("home-network")
  
  connectToNetwork("guest")(homeNetwork)
  connectToNetwork("Joe Hacker")
}

atOffice()
atJoesHome()