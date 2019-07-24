package mydemomdc7;

import org.testng.annotations.Test;

public class Demo_502 {
  @Test (priority=2)
  public void lgin() {
	  System.out.println("code for login");
  }
  @Test 
  public void lgout() {
	  System.out.println("code for logout");
  }
  @Test (priority=1)
  public void register() {
	  System.out.println("code for register");
  }
  @Test (priority=3)
  public void addcasrt() {
	  System.out.println("code for addtocart");
  }
  @Test (priority=4)
  public void removercart() {
	  System.out.println("code for removecart");
  }
}
