class Equipment(val routine: Int => Int) {
  def simulate(input: Int): Int = {
    print("Running simulation...")
    routine(input)
  }
}
