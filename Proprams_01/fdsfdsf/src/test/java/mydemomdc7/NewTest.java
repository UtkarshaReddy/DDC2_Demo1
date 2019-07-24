package mydemomdc7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
//  @BeforeClass
//  public void login() {
//	  System.out.println("code for login");
//  }
  @BeforeMethod
  public void login() {
	  System.out.println("code for login");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("code for logout");
  }
  @Test (enabled= false)
  public void addcart() {
	  System.out.println("code for addcart");
  }
  @Test (invocationCount =10)
  public void removercart() {
	  System.out.println("code for removercart");
  }
  @Test (enabled= false)
  public void updateprfl() {
	  System.out.println("code for updateprfl");
  }

}
