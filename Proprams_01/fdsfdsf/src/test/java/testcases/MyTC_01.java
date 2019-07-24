package testcases;

import org.testng.annotations.Test;

public class MyTC_01 {
  @Test (priority=2)
  public void Login() {
	  System.out.println("code for login");
  }
  @Test (priority=1, enabled= false)
  public void Registration() {
	  System.out.println("code for Registration");
  }
  @Test (priority=4)
  public void Logout() {
	  System.out.println("code for Logout");
  }
  @Test (priority=3)
  public void AddtoCart() {
	  System.out.println("code for AddtoCart");
  }
}
