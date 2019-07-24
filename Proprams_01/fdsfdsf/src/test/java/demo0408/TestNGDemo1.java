package demo0408;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	WebDriver driver;
  @Test(invocationCount=10)
  public void login() {
//	  driver= Driver123.getDriver("chrome");
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  driver.get("http://newtours.demoaut.com/");
//	  driver.findElement(By.name("userName")).sendKeys("Demo");
//	  driver.findElement(By.name("password")).sendKeys("Demo");
//	  driver.findElement(By.name("login")).click();
//	  driver.close();
	  System.out.println("Hi Srinivas");
  }

}
