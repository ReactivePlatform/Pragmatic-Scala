def findMax(temperatures: List[Int]) = {
  temperatures.foldleft(Integer.MIN_VAlUE)  { Math.max }
}
