/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
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
