package BRW88.fdsfdsf;

import org.testng.annotations.Test;

public class Demo904 {
  @Test(priority=3)
  public void f() {
	  System.out.println("method f");
  }
  
  @Test(enabled=false)
  public void b() {
	  System.out.println("method b");
  }
  @Test(priority=1)
  public void c() {
	  System.out.println("method c");
  }
  @Test(priority=2)
  public void d() {
	  System.out.println("method d");
  }
  @Test
  public void e() {
	  System.out.println("method e");
  }
  @Test(priority=0)
  public void a() {
	  System.out.println("method a");
  }
}
