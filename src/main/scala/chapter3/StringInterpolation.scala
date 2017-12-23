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

package chapter3

object StringInterpolation extends App {
  val discount = 10

  // #snip_3-21
  val message = s"A discount of $discount% has been applied"
  // #snip_3-21

  println(message)

  {
    // #snip_3-22
    var price = 90
    val totalPrice = s"The amount of discount is ${price * discount / 100} dollars"
    // #snip_3-22

    println(totalPrice)
  }

  {
    var price = 90
    // #snip_3-23
    val totalPrice = s"The amount of discount is $$${price * discount / 100}"
    // #snip_3-23
    println(totalPrice)
  }

  {
    // #snip_3-24
    val discount = 10
    var price = 100
    val totalPrice =
      s"The amount after discount is $$${price * (1 - discount / 100.0)}"
    println(totalPrice)

    price = 50
    println(totalPrice)
    // #snip_3-24
  }

  {
    // #snip_3-25
    val product = "ticket"
    val price = 25.12
    val discount = 10
    println(s"On $product $discount% saves $$${price * discount / 100.00}")
    // #snip_3-25
  }

  {
    val product = "ticket"
    val price = 25.12
    val discount = 10
    // #snip_3-26
    println(f"On $product $discount%% saves $$${price * discount / 100.00}%2.2f")
    // #snip_3-26
  }

  {
    val product = "ticket"
    val price = 25.12
    // #snip_3-27
    println(s"We just got the $product\nThe price was $$$price.")
    // #snip_3-27
  }

  {
    val product = "ticket"
    val price = 25.12
    // #snip_3-28
    println(raw"We just got the $product\nThe price was $$$price.")
    // #snip_3-28
  }

}
