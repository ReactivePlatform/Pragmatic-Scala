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

def getPersonInfo(primaryKey : Int) = { 
  // Assume primaryKey is used to fetch a person's info... 
  // Here response is hard-coded
  ("Venkat", "Subramaniam", "venkats@agiledeveloper.com") 
}

val (firstName, lastName, emailAddress) = getPersonInfo(1)

println(s"First Name: $firstName")
println(s"Last Name: $lastName")
println(s"Email Address: $emailAddress")