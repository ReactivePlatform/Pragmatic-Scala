val array = Array(2, 3, 5, 1, 6, 4)
val sum = inject(array, 0) { (carryOver, elem) => carryOver + elem }
