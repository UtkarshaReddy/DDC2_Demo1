package mydemomdc7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest98 {
  @Test
  public void function1() {
	  System.out.println("code for function1");
  }
  @Test
  public void function2() {
	  System.out.println("code for function2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("code for beforeClass ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("code for afterClass ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("code for beforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("code for afterTest ");
  }
  @AfterMethod
  public void AfterMethod() {
	  System.out.println("code for AfterMethod ");
  }
//  @BeforeMethod (enabled= false)
//  public void BeforeMethod() {
//	  System.out.println("code for BeforeMethod ");
//  }
}
