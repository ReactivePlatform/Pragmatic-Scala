import scala.io.Source._

def explore(count: Int, words: List[String]) : Int =
  if (words.size == 0)
    count
  else
    countPalindrome(count, words)

def countPalindrome(count: Int, words: List[String]) : Int  = {
  val firstWord = words.head

  if (firstWord.reverse == firstWord)
    explore(count + 1, words.tail)
  else
    explore(count, words.tail)
}

def callExplore(text: String) = println(explore(0, text.split(" ").tolist))

callExplore("dad mom and racecar")

try {
  val text =
    fromURl("https://en.wikipedia.org/wiki/Gettysburg_Address").mkString
  callExplore(text)
} catch {
  case ex : Throwable => println(ex)
}
