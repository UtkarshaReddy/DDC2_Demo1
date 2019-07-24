package BRW88.fdsfdsf;

import org.testng.annotations.Test;

public class DependsDemo {
  @Test(invocationCount=5, enabled= false)
  public void f() {
	  System.out.println("Hi Srinivas");
  }
  @Test
  public void register() {
	 int a=10;
	 int b= 0;
	int div = a/b;
	System.out.println(div);
//	 System.out.println("godari");
  }
  @Test(dependsOnMethods="register")
  public void login() {
	  System.out.println("Hi Srinivas");
  }
}
