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

package chapter6

object Resource extends App {
  // #snip_6-33
  class Resource private () {
    println("Starting transaction...")
    private def cleanUp(): Unit = { println("Ending transaction...") }
    def op1(): Unit = println("Operation 1")
    def op2(): Unit = println("Operation 2")
    def op3(): Unit = println("Operation 3")
  }

  object Resource {
    def use(codeBlock: Resource ⇒ Unit): Unit = {
      val resource = new Resource
      try {
        codeBlock(resource)
      } finally {
        resource.cleanUp()
      }
    }
  }
  // #snip_6-33

  // #snip_6-34
  Resource.use { resource ⇒
    resource.op1()
    resource.op2()
    resource.op3()
    resource.op1()
  }
  // #snip_6-34

}
