import scala.io.Source._
import scala.util.control.TailCalls._

def explore(count: Int, words: List[String]): TailRec[Int] =
  if (words.isEmpty)
    done(count)
  else
    tailcall(countPalindrome(count, words))

def countPalindrome(count: Int, words: List[String]): TailRec[Int] = {
  val firstWord = words.head

  if (firstWord.reverse == firstWord)
    tailcall(explore(count + 1, words.tail))
  else
    tailcall(explore(count, words.tail))
}

def callExplore(text: String): Unit =
  println(explore(0, text.split(" ").toList).result)

callExplore("dad mom and racecar")

try {
  val text =
    fromURL("https://en.wikipedia.org/wiki/Gettysburg_Address").mkString
  callExplore(text)
} catch {
  case ex: Throwable ⇒ println(ex)
}