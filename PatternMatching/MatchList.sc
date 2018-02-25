def processItems(items: List[String]): Unit = {
  items match {
    case List("apple", "ibm")         => println("Apples and IBMs")
    case List("red", "blue", "white") => println("Stars and Stripes...")
    case List("red", "blue", _*)      => println("colors red, blue,... ")
    case List("apple", "orange", otherFruits @ _*) ⇒
      println("apples, oranges, and " + otherFruits)
  }
}

processItems(List("apple", "ibm"))
processItems(List("red", "blue", "green"))
processItems(List("red", "blue", "white"))
processItems(List("apple", "orange", "grapes", "dates"))
