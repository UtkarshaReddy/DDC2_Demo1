package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TC_02 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println("username is :"+n);
	  System.out.println("Password is :"+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
      new Object[] { "QAtesting", "Srinivas" },
    };
  }
  @AfterMethod
  public void logout()
  {
	  System.out.println("code for logout");
  }
  @BeforeMethod
  public void h()
  {
	  System.out.println("code for clearing the browser history");
  }
  
}