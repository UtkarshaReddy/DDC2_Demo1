package pages;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class TestNGDemo_02 {
  @Test(dataProvider = "credentials", priority = 1)
  public void registration(String n, String s) {
	  System.out.println("code for registration");
	  System.out.println("username is :"+n);
	  System.out.println("password is :"+s);
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "Sunil", "Password123" },
      new Object[] { "Srikanth", "Password6453" },
      new Object[] { "Niharika", "Password456" },
      new Object[] { "Utkarsha", "Password879" },
    };
  }
  @AfterMethod
  public void login()
  {
	System.out.println("code for login"); 
	
  }
  
  }

