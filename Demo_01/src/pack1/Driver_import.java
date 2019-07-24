package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Driver_import 
{
  @Test
  public void f() 
  {   
	  WebDriver driver;
//	  driver=My_Drivers.getDriver("ff");
//	  driver.get("https://www.google.com");
	  
	  driver=My_Drivers.getDriver("ie");
	  driver.get("https://www.google.com");
	  
//	  driver=My_Drivers.getDriver("chrome");
//	  driver.get("https://www.google.com");
  }
}
