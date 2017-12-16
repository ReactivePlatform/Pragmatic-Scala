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

class ExceptionTest extends org.scalatest.Suite {
  def testGetOnEmptyList() {
    try {
      val list = new java.util.ArrayList[Integer]
      list.get(0)
      fail("Expected exception for getting element from empty list")
    }  
	
    catch {
      case ex: IndexOutOfBoundsException => // :) Success
    }
  }

  def testGetOnEmptyList_Concise() {
      val list = new java.util.ArrayList[Integer]
      intercept(classOf[IndexOutOfBoundsException], 
          "Expected exception for getting element from empty list") { 
        list.get(0) 
      }
      
      //You'll get a deprecation warning from the statement above.
      //ScalaTest is evolving to use a newer style for intercept.
      //Currently the new style does not take an error message argument.
      //When it does, you should use
      //intercept[IndexOutOfBoundsException] ("Expected ...") {...}      
  }
}

(new ExceptionTest).execute()
