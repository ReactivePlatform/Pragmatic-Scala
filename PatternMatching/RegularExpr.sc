val pattern = "(S|s)cala".r
val str = "Scala is scalable and cool"
println(pattern findFirstIn str)
println((pattern findAllIn str).mkString(", "))
println("cool".r replaceFirstIn (str, "awesome"))
