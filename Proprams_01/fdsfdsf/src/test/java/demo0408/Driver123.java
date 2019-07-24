package demo0408;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver123 {

	public static WebDriver  getDriver(String Browser) {
		if (Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (Browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Drivers\\Drivers\\IEDriverServer.exe");
			return new  InternetExplorerDriver();
		}
		else if (Browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Drivers\\Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else
			return null;
	}

}
