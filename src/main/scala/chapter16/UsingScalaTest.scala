/*
 * Copyright 2017 pragmatic-scala.reactiveplatform.xyz
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

import org.scalatest._
import java.util.ArrayList

class UsingScalaTest extends FlatSpec with Matchers {
  trait EmptyArrayList {
    val list = new ArrayList[String]
  }

  "a list" should "be empty on create" in new EmptyArrayList {
    list.size should be(0)
  }

  "a list" should "increase in size upon add" in new EmptyArrayList {
    list.add("Milk")
    list add "Sugar"

    list.size should be(2)
  }
}
