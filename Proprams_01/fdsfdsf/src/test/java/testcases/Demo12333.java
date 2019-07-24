package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo12333 {
  @Test
  public void f() {
	  System.out.println("code f");
  }
  @Test
  public void g() {
	  System.out.println("code g");
  }
  @Test
  public void h() {
	  System.out.println("code h");
  }
  @BeforeClass
  public void login() {
	  System.out.println("login");
  }
  @AfterClass
  public void logout() {
	  System.out.println("logout");
  }
  @AfterTest
  public void bug() {
	  System.out.println("raise a bug");
  }
  @BeforeTest
  public void attendcall() {
	  System.out.println("attendcall");
  }
  @AfterSuite
  public void go() {
	  System.out.println("go to home");
  }
  @BeforeSuite
  public void come() {
	  System.out.println("come to office");
  }
}
