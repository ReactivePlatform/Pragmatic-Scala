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

class ShareCodeImperative extends org.scalatest.Suite 
  with org.scalatest.BeforeAndAfter {
  var list : java.util.ArrayList[Integer] = _
  
  override def beforeEach() { list = new java.util.ArrayList[Integer] }
  override def afterEach() { list = null }
  def testListEmptyOnCreate() {
    expect(0, "Expected size to be 0") { list.size() }
  }
  def testGetOnEmptyList() {
    intercept[IndexOutOfBoundsException] { list.get(0) }
  }
}
(new ShareCodeImperative).execute()
