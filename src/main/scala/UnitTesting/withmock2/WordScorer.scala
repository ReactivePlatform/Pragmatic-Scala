/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class WordScorer(val spellChecker: SpellChecker) {
  private val VOWELS = List('a', 'e', 'i', 'o', 'u')
  
  def score(word: String) = {
    if(spellChecker.isCorrect(word))
      (0 /: word) { (total, letter) => 
                      total + (if (VOWELS.contains(letter)) 1 else 2) }
    else
      0
  }
}