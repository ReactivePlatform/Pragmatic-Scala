def mail(destination: String = "head office", mailClass: String = "first") =
  println(s"sending to $destination by $mailClass class")

mail("Houston office", "Priority")
mail("Boston office")
mail()
