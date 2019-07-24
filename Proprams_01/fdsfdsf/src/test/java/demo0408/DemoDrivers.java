package demo0408;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoDrivers {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= Driver123.getDriver("chrome");
	  driver.get("https://www.google.com");
	  
  }
  @Test
  public void g() {
	  driver= Driver123.getDriver("ie");
	  driver.get("https://www.google.com");
	  
  }
  @Test
  public void h() {
	  driver= Driver123.getDriver("firefox");
	  driver.get("https://www.google.com");
	  
  }
}
