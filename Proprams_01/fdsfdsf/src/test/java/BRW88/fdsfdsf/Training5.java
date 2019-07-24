package BRW88.fdsfdsf;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Training5 {
  @Test
  public void Login() {
	  System.out.println("Login");
  }
  @BeforeTest
  public void Launch() {
	  System.out.println("BeforeClass");
  }
  
  @AfterTest
  public void Logout() {
	  System.out.println("AfterClass");
  }
}
