package BRW88.fdsfdsf;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo402 {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= Drivers88.getDriver("Chrome");
	  driver.get("http://www.google.com");
	  driver.close();
	  driver= Drivers88.getDriver("FireFox");
	  driver.get("http://www.google.com");
	  driver.close();
	  driver= Drivers88.getDriver("IE");
	  driver.get("http://www.google.com");
	  driver.close();
  }
}
