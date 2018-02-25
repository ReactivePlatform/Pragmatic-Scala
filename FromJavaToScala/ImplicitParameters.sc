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
