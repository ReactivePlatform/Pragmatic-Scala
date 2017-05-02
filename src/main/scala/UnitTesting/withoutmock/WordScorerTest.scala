/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import org.scalatest.{FlatSpec, Matchers}

class WordScorerTest extends FlatSpec with Matchers {
  
  def withWordScorer(test: WordScorer => Unit) = {
    val wordScorer = new WordScorer()
    
    test(wordScorer)
  }
   
  "score" should "return 0 for an empty word" in {
    withWordScorer { wordScorer => wordScorer.score("") should be (0) }
  }
  
  "score" should "return 2 for word with two vowels" in {
    withWordScorer { _.score("ai") should be (2) }    
  }
  
  "score" should "return 8 for word with four consonants" in {
    withWordScorer { _.score("myth") should be (8) }        
  }

  "score" should "return 7 for word with a vowel and three consonants" in {
    withWordScorer { _.score("that") should be (7) }
  }
}