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

class Resource private () {
  println("Starting transaction...")
  private def cleanUp() { println("Ending transaction...") }
  def op1() = println("Operation 1")
  def op2() = println("Operation 2")
  def op3() = println("Operation 3")
}

object Resource {
  def use(codeBlock: Resource ⇒ Unit) {
    val resource = new Resource
    try {
      codeBlock(resource)
    } finally {
      resource.cleanUp()
    }
  }
}

Resource.use { resource ⇒
  resource.op1()
  resource.op2()
  resource.op3()
  resource.op1()
}
