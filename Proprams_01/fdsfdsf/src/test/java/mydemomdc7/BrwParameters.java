package mydemomdc7;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class BrwParameters {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String Browserzz) {
	  driver = Drivers321.getDriver(Browserzz);
	  driver.get("http://www.google.com");
	  driver.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "chrome" },
      new Object[] { "ie" },
      new Object[] { "firefox" },
    };
  }
}
