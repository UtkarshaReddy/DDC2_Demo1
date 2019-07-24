package BRW88.fdsfdsf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers33 {

	public static WebDriver getDriver(String Browser) 
	{
		// TODO Auto-generated method stub
		if (Browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe\\");
			return new ChromeDriver();
		}

	
		 if (Browser.equals("internet"))
		{  System.setProperty("webdriver.ie.driver","C:\\Drivers\\Drivers\\IEDriverServer.exe");

		return new InternetExplorerDriver();
		}
		 else
			 if (Browser.equals("internet"))
				{  System.setProperty("webdriver.ie.driver","C:\\Drivers\\Drivers\\IEDriverServer.exe");

				return new InternetExplorerDriver();
				}
			 else
				 
 		 return null;
			 
		 
	}
	
}
			
