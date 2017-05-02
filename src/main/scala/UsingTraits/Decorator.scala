/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
abstract class Check {
  def check : String = "Checked Application Details..."
}

trait CreditCheck extends Check {
  override def check : String = s"Checked Credit... ${super.check}"
}

trait EmploymentCheck extends Check {
  override def check : String = s"Checked Employment...${super.check}"
}

trait CriminalRecordCheck extends Check {
  override def check : String = s"Check Criminal Records...${super.check}"
}
     
val apartmentApplication = 
  new Check with CreditCheck with CriminalRecordCheck

println(apartmentApplication.check)
     
val employmentApplication = 
  new Check with CriminalRecordCheck with EmploymentCheck

println(employmentApplication.check)
