def generate(starting: Int): Stream[Int] = {
  starting #:: generate(starting + 1)
}

println(generate(25))
println(generate(25).take(10).force)
println(generate(25).take(10).toList)
println(generate(25).takeWhile { _ < 40 }.force)
