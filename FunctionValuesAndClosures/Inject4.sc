def inject(arr: Array[Int], initial: Int)(operation: (Int, Int) ⇒ Int): Int = {
  var carryOver = initial
  arr.foreach(element => carryOver = operation(carryOver, element))
  carryOver
}
val array = Array(2, 3, 5, 1, 6, 4)
val sum: Int = inject(array, 0) { (carryOver, elem) => carryOver + elem }
