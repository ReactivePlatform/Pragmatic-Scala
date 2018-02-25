def max(values: Int*) = values.foldLeft(values(0)) { Math.max }
max(8, 2, 3)
max(2, 5, 3, 7, 1, 6)
