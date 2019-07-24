package BRW88.fdsfdsf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers88 {

	public static WebDriver getDriver(String browser) {
//		SODO Auto-generated method stub
if (browser.equals("Chrome"))
{
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
  return   new ChromeDriver();
}
  else if (browser.equals("FireFox"))
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\Drivers\\geckodriver.exe");
return   new FirefoxDriver();
  }
else if(browser.equals("IE"))
		{
		System.setProperty("webdriver.ie.driver","C:\\Drivers\\Drivers\\IEDriverServer.exe"); 
		return new InternetExplorerDriver();
		}
		else
			return null;
	}
}
