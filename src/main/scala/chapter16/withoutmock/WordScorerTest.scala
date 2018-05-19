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

package chapter16.withoutmock

// #snip
import org.scalatest.{ FlatSpec, Matchers }

class WordScorerTest extends FlatSpec with Matchers {

  def withWordScorer(test: WordScorer ⇒ Unit): Unit = {
    val wordScorer = new WordScorer()

    test(wordScorer)
  }

  "score" should "return 0 for an empty word" in {
    withWordScorer { wordScorer ⇒ wordScorer.score("") should be(0) }
  }

  "score" should "return 2 for word with two vowels" in {
    withWordScorer { _.score("ai") should be(2) }
  }

  "score" should "return 8 for word with four consonants" in {
    withWordScorer { _.score("myth") should be(8) }
  }

  "score" should "return 7 for word with a vowel and three consonants" in {
    withWordScorer { _.score("that") should be(7) }
  }
}
// #snip
