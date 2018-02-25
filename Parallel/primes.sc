def isDivisibleBy(number: Int, divisor: Int) = number % divisor == 0

def isPrime(number: Int) =
  number > 1 && !(2 until number).exists { isDivisibleBy(number, _) }

def primes(starting: Int): Stream[Int] = {
  println(s"computing for $starting")
  if (isPrime(starting))
    starting #:: primes(starting + 1)
  else
    primes(starting + 1)
}
val primesFrom100 = primes(100)

println(primesFrom100.take(3).toList)
println("Let's ask for more...")
println(primesFrom100.take(4).toList)
