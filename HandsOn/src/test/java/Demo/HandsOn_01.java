package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandsOn_01 
{
  @Test
  public void f() 
  {
	WebDriver driver; 
	System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.manage().window().maximize();
	driver.close();
	
//	WebDriver driver; 
//	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
//	driver = new ChromeDriver();
//	driver.get("https://retail.onlinesbi.com/retail/login.htm");
//	driver.manage().window().maximize();
//	driver.close();
//	
//	WebDriver driver; 
//	System.setProperty("webdriver.ie.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
//	driver = new InternetExplorerDriver();
//	driver.get("https://retail.onlinesbi.com/retail/login.htm");
//	driver.manage().window().maximize();
//	driver.close();
  }
}
