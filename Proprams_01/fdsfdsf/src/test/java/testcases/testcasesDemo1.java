package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class testcasesDemo1 {
	 
		@Test
			public void verifyLogin() {
				
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("http://newtours.demoaut.com/");
				LoginPage lp=new LoginPage(driver);	
				lp.setUser();
				lp.setPass();
				lp.clickLogin();
				lp.clickHome();
			} 
}
