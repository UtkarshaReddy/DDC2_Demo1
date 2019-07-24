package BRW88.fdsfdsf;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest81 {
  @Test(dataProvider = "dp")
  public void f(Integer uid, String name) {
	  System.out.println("username:"+uid+"\t\tpassword:"+name);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
	  
  }
  @Test
  public void hi()
  {
	  System.out.println("Good eveninig");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
 }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("beforeClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("afterSuite");
  }

}
