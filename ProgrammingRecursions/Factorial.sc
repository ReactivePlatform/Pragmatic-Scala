def factorial(number: Int): BigInt = {
  if (number == 0)
    1
  else
    number * factorial(number - 1)
}
