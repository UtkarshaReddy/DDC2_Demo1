package BRW88.fdsfdsf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers99 {

	public static WebDriver getDriver(String browser) {
		// TODO Auto-generated method stub
if (browser.equals("fff"))
{
	System.setProperty("webdriver.gecko.driver","C:\\Drivers\\Drivers\\geckodriver.exe" ); 
	return new FirefoxDriver();  
	}
else if (browser.equals("ccc"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
		return new ChromeDriver();  
	}
	else if (browser.equals("mmm"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
		return new ChromeDriver();  
	}	
	else
	return null;

}
}