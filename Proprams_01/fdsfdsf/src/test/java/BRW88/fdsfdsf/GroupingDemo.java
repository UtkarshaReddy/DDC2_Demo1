package BRW88.fdsfdsf;

import org.testng.annotations.Test;

public class GroupingDemo {
  @Test(groups= {"regression","sanity"})
  public void g() {
	  System.out.println("g");
  }
  @Test(groups= {"sanity"})
  public void f() {
	  System.out.println("f");
  }
  @Test(groups= {"regression"})
  public void h() {
	  System.out.println("h");
  }
}
