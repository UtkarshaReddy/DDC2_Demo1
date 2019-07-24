package BRW88.fdsfdsf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Drivers23 {

	public static WebDriver getDriver(String Browser)
	{
		if (Browser.equals("seleniumfirfox"))
		{ 
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\Drivers\\geckodriver.exe" ); 
		return new FirefoxDriver();  
		}
		if (Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
			return new ChromeDriver();   
		}
		else if (Browser.equals("internet"))
		{  System.setProperty("webdriver.ie.driver","C:\\Drivers\\Drivers\\IEDriverServer.exe");

		return new InternetExplorerDriver();  
		}
		else {
			return null;
		}
	}
}