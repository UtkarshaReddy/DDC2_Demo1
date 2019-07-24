package mydemomdc7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pramrtr_demo2 {
	
	WebDriver driver;
  @Test (dataProvider = "creds")
  public void login(String Name, String Pswrd) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.name("userName")).sendKeys(Name);
	  driver.findElement(By.name("password")).sendKeys(Pswrd);
	  Thread.sleep(5000);
	  driver.findElement(By.name("Login")).click();  
  }  
  @DataProvider
  public Object[][] creds() {
    return new Object[][] {
      new Object[] { "Lalitha", "Password123"},
      new Object[] { "Admin", "Password456" },
      new Object[] { "Srini", "QA" },
    };
       }
  @AfterMethod
  public void logout()
  {
	Assert.assertEquals(driver.getTitle(), "Home");
  	driver.close();
  }
  @BeforeMethod
  public void cleaccahed()
  {
  	System.out.println("code for clearing the brwser cache");
  }
}