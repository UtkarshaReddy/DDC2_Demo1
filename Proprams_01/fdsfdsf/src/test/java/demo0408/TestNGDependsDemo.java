package demo0408;

import org.testng.annotations.Test;

public class TestNGDependsDemo {
  @Test
  public void register() {
//	  System.out.println("code for registering");
	  int a=10;
	  int b=0;
	  int div=a/b;
	  System.out.println(div);
  }
  @Test
  public void login() {
	  System.out.println("code for login");
  }
  @Test(dependsOnMethods="register")
  public void logout() {
	  System.out.println("code for logout");
  }
}
