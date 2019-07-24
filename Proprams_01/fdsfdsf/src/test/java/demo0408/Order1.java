package demo0408;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Order1 {
  @Test
  public void login() {
	  System.out.println("code for login");
  }
  @Test
  public void register() {
	  System.out.println("code for register");
  }
  @Test
  public void logout() {
	  System.out.println("code for logout");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("open application");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("close application");
  }
  @BeforeClass
  public void OPenBrwser() {
	  System.out.println("code for opening Chrome Browser");
  }
  @AfterClass
  public void CloseBrwser() {
	  System.out.println("code for closing Chrome Browser");
  }
  @BeforeClass (enabled=false)
  public void OPenBrwser1() {
	  System.out.println("code for opening Chrome Browser1");
  }
  @AfterClass(enabled=false)
  public void CloseBrwser1() {
	  System.out.println("code for closing Chrome Browser1");
  }
  @BeforeSuite
  public void clientConfirmation() {
	  System.out.println("code for clientConfirmation");
  }
  @AfterSuite
  public void SendReport() {
	  System.out.println("code for SendReport");
  }
  @BeforeTest
  public void ServerON() {
	  System.out.println("code for ServerON");
  }
  @AfterTest
  public void ServerOFF() {
	  System.out.println("code for ServerOFF");
  }

}
