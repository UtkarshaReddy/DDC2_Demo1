package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DTours1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("userName")).sendKeys("demo");
	  driver.findElement(By.name("password")).sendKeys("demo");
	  Thread.sleep(5000);
	  driver.findElement(By.name("login")).click();
  }
}
