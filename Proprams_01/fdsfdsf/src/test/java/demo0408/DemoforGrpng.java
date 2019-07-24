package demo0408;

import org.testng.annotations.Test;

public class DemoforGrpng {
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
}
