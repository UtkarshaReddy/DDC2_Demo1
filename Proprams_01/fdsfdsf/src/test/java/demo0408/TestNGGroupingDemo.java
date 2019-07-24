package demo0408;

import org.testng.annotations.Test;

public class TestNGGroupingDemo {
  @Test(groups={"sanity", "regression"})
  public void login() {
	  System.out.println("code for login");
  }
  @Test(groups={"smoke", "regression"})
  public void logout() {
	  System.out.println("code for logout");
  }
  @Test(groups={"regression"})
  public void register() {
	  System.out.println("code for register");
  }
  @Test(groups={"regression"})
  public void addtocart() {
	  System.out.println("code for addtocart");
  }
  @Test(groups={"smoke"})
  public void removeacrt() {
	  System.out.println("code for removeacrt");
  }
  @Test(groups={"sanity"})
  public void payment() {
	  System.out.println("code for payment");
  }
  @Test(groups={"regression"})
  public void trackyourorder() {
	  System.out.println("code for trackyourorder");
  }
}
