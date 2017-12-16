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

class Item(val name: String) {
  def +(other: Item) : Item = new Item("'" + name + " and " + other.name + "'")
  def +-(other: Item) : Item = new Item("--" + name + " and some " + other.name + "--")
  
  def &(other: Item) : Item = new Item(name + " with " + other.name)
  
  override def toString : String = name
}

val coffee = new Item("Coffee")
val sugar = new Item("Sugar")
val milk = new Item("Milk")
val cream = new Item("Cream")
                
println(coffee & milk + sugar +- cream)
