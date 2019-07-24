package demo0408;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class MyDemo2 {
  @Test(enabled=false)
  public void register() {
//	  System.out.println("Hi All");
	  System.out.println("code for registration");
  }
  @Test(priority=3)
  public void logout() {
	  System.out.println("code for logout");	
//	  System.out.println("good evening");
  }
  @Test(priority=1)
  public void login() {
//	  System.out.println("Hi All");
	  System.out.println("code for login");
  }
}
