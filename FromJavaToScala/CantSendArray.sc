def max(values: Int*) = values.foldLeft(values(0)) { Math.max }

val numbers = Array(2, 5, 3, 7, 1, 6)
max(numbers) // type mismatch error
