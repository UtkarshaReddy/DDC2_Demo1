package pages;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Demo_03 {
	WebDriver driver;
//  @BeforeMethod
//  public void launch()
//  {
////	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe" );
////	  driver = new ChromeDriver();
////	  driver.get("URL" );
//	  System.out.println("code for launch");
//  }
  @Test (invocationCount=10)
//  @Test(dataProvider = "cred")
  public void login() {
	  System.out.println("code for login for registration");
//	  System.out.println("code for login for :"+n);
//	  System.out.println("code for verification:"+n);
//	  String  E_title = "Home";
////	     String A_title = driver.getTitle();
//	    String A_title = "Home";
//	     if (A_title.equals(E_title))
//	     {
//	    	 System.out.println("login success");
//	     }
//	     else
//	     {
//	    	 System.out.println("login failure");
////	     }
//	    Assert.assertEquals(E_title, A_title);
//	    System.out.println("Login Successfull");
  }
//  @DataProvider
//  public Object[][] cred() {
//    return new Object[][] {
//      new Object[] { "srini", "a" },
//      new Object[] { "test", "b" },
//    };
//  }
//  @AfterMethod
//  public void logout() {
//	  System.out.println("code for logout");
//  }
}
