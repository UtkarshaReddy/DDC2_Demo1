package ddc2July_19;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test79 {
	WebDriver driver;
  @Test
  public void f() {
	  driver=MyDriver123.getDriver("srini");
	  driver.get("http://newtours.demoaut.com");
  }
}
