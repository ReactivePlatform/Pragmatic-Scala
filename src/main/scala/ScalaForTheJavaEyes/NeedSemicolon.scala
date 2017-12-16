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

object Sample {
  def apply() : Sample = new Sample
}           
              
class Sample

val sample1 = new Sample //OK, semicolon not needed
{
  println("semicolon is optional above")
}

val sample2 = Sample //Error, semicolon is needed
{
  println("semicolon is not optional above")
}

println("Won't work")
