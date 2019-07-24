package BRW88.fdsfdsf;

import org.testng.annotations.Test;

public class Training1 {
  @Test(priority=1,enabled=false)
  public void launch() {
	  System.out.println("launch code");
  }
  @Test(priority=2)
  public void register() {
	  System.out.println("register code");
  }
  @Test(priority=3)
  public void login() {
	  System.out.println("login code");
  }
  @Test
  public void forgtpswrd() {
	  System.out.println("forgtpswrd code");
  }
  @Test
  public void search() {
	  System.out.println("search code");
  }
  @Test
  public void addcart() {
	  System.out.println("addcart code");
  }
  @Test
  public void removercart() {
	  System.out.println("removercart code");
  }
  @Test
  public void payment() {
	  System.out.println("payment code");
  }
  @Test(enabled=false)
  public void logout() {
	  System.out.println("logout code");
  }
}
