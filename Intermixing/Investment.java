//Java code
package investments;

public class Investment {                                        
  private String investmentName;
  private InvestmentType investmentType;
             
  public Investment(String name, InvestmentType type) {
    investmentName = name;
    investmentType = type;
  } 
  public int yield() { return 0; }
}
