/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import scala.io.Source._
import scala.util.control.TailCalls._

def explore(count: Int, words: List[String]) : TailRec[Int] =
  if(words.size == 0)
    done(count)
  else
    tailcall(countPalindrome(count, words))

def countPalindrome(count: Int, words: List[String]) : TailRec[Int]  = {
  val firstWord = words.head
  
  if(firstWord.reverse == firstWord)
    tailcall(explore(count + 1, words.tail))
  else
    tailcall(explore(count, words.tail))
}

def callExplore(text: String) = 
  println(explore(0, text.split(" ").toList).result)

callExplore("dad mom and racecar")

try {
  val text = 
    fromURL("https://en.wikipedia.org/wiki/Gettysburg_Address").mkString
  callExplore(text)  
} catch {
  case ex : Throwable => println(ex)
}
