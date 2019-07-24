package mydemomdc7;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grpngdemo {
  @Test(groups = {"regression","Sanity" })
  public void lgon() {
	  System.out.println("code for login");
  }
  @Test(groups = {"Sanity" })
  public void lgot() {
	  System.out.println("code for logout");
  }
  @Test (groups = {"regression"})
  public void regi() {
	  System.out.println("code for register");
  }
  @Test (groups = {"smoke","Sanity" })
  public void pfrlupdate() {
	  System.out.println("code for profile");
  }
  
  @Test (groups = {"smoke","Sanity", "myown" })
  @Parameters( {"trainer", "location"})
  public void addcart(String trainer, String location ) {
	  System.out.println("code for addcart");
	  System.out.println(trainer);
	  System.out.println(location);
  }
  @Test(groups = {"regression","smoke" })
  public void remvcart() {
	  System.out.println("code for removecart");
  }
}
