package ddc2July_19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver123 {

	public static WebDriver getDriver(String browser) {
		if (browser.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
   return new ChromeDriver();
		}
		else if (browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
		   return new InternetExplorerDriver();
				}
		else if (browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Drivers\\geckodriver.exe");
		   return new FirefoxDriver();
				}
		else
			return null;
	}

}
