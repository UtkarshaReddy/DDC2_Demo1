package BRW88.fdsfdsf;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;

public class Demo903 {
	WebDriver TestMe;
  @Test(dataProvider = "creds")
  public void f(String n, String s) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  TestMe = new ChromeDriver();
	  TestMe.get("http://10.243.204.222:8039/TestMeApp/login.htm");
	  TestMe.findElement(By.name("userName")).sendKeys(n);
	  TestMe.findElement(By.name("password")).sendKeys(s);
	  TestMe.findElement(By.name("Login")).click();
	  Thread.sleep(12000);
	  TestMe.close();	  
  }
  @DataProvider
  public Object[][] creds() {
    return new Object[][] {
      new Object[] { "lalitha", "Password123" },
      new Object[] { "admin", "Password456" },
      new Object[] { "revanth", "revanth123" },
    };
  }
}
