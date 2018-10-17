def findMax(temperatures: List[Int]) = {
  temperatures.foldLeft(Integer.MIN_VALUE)  { Math.max }
}
