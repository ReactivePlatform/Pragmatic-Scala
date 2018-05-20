/*
 * Copyright 2018 pragmatic-scala.reactiveplatform.xyz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package chapter11

object Words extends App {

  // #snip
  import scala.io.Source._

  def explore(count: Int, words: List[String]): Int =
    if (words.isEmpty)
      count
    else
      countPalindrome(count, words)

  def countPalindrome(count: Int, words: List[String]): Int = {
    val firstWord = words.head

    if (firstWord.reverse == firstWord)
      explore(count + 1, words.tail)
    else
      explore(count, words.tail)
  }

  def callExplore(text: String): Unit = println(explore(0, text.split(" ").toList))

  callExplore("dad mom and racecar")

  try {
    val text =
      fromURL("https://en.wikipedia.org/wiki/Gettysburg_Address").mkString
    callExplore(text)
  } catch {
    case ex: Throwable ⇒ println(ex)
  }
  // #snip

}
