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

val discount = 10

val message = s"A discount of $discount% has been applied"
println(message)

{
var price = 90
val totalPrice = s"The amount of discount is ${price * discount / 100} dollars"
println(totalPrice)
}

{
var price = 90
val totalPrice = s"The amount of discount is $$${price * discount / 100}"
println(totalPrice)
}

{
println("//" + "START:EXPRESSION3_OUTPUT")
val discount = 10
var price = 100
val totalPrice = 
  s"The amount after discount is $$${price * (1 - discount/100.0)}"
println(totalPrice)

price = 50
println(totalPrice)
println("//" + "END:EXPRESSION3_OUTPUT")
}

{
println("//" + "START:NOFORMAT_OUTPUT")
val product = "ticket"
val price = 25.12
val discount = 10
println(s"On $product $discount% saves $$${price * discount/100.00}")
println("//" + "END:NOFORMAT_OUTPUT")
}

{
println("//" + "START:FORMAT_OUTPUT")
val product = "ticket"
val price = 25.12
val discount = 10
println(f"On $product $discount%% saves $$${price * discount/100.00}%2.2f")
println("//" + "END:FORMAT_OUTPUT")
}

{
val product = "ticket"
val price = 25.12
println("//" + "START:HEREDOC_OUTPUT")
println(s"We just got the $product\nThe price was $$$price.")
println("//" + "END:HEREDOC_OUTPUT")
}

{
val product = "ticket"
val price = 25.12
println("//" + "START:RAW_OUTPUT")
println(raw"We just got the $product\nThe price was $$$price.")
println("//" + "END:RAW_OUTPUT")
}
