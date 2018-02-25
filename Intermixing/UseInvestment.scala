import investments._

object UseInvestment extends App {
  val investment = new Investment("XYZ Corporation", InvestmentType.STOCK)
  println(investment.getClass)
}
