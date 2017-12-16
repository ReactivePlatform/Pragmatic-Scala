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

class OrderItem(val title: String, var quantity: Int) {                                        
  override def toString : String = "Title " + title + ", Quantity " + quantity
}

object OrderItem {
  def apply(title: String, quantity: Int) = new OrderItem(title, quantity)
}
              
val item1 = new OrderItem("The Art of Computer Programming", 1)

var item2 = OrderItem("The Pragmatic Programmer", 1)

OrderItem.apply("The Pragmatic Programmer", 1)
              
println(item1)
println(item2)
