package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyTC_03 
{
	@Test
	  public void f() 
	  {
		  System.out.println("code f");
	  }
	  @Test
	  public void g() 
	  {
		  System.out.println("code g");
	  }

	  @Test
	  public void h() 
	  {
		  System.out.println("code h");
	  }
 
	  @BeforeClass
	  public void beforeClass()
	  {
		  System.out.println("login");
	  }

	  @AfterClass
	  public void afterClass() 
	  {
		  System.out.println("logout");
	  }
	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("raise a bug");
	  }
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("attend call");
	  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Come to office");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("go to home");
  }

}
