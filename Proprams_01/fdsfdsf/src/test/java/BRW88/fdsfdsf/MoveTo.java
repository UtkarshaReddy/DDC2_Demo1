package BRW88.fdsfdsf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoveTo {
	WebDriver driver;

  @BeforeMethod
  public void move()
  {
  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
  driver = new ChromeDriver();
  
  }
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.spicejet.com/");
	  Actions a11 = new Actions(driver);
	  a11.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
	 Thread.sleep(3000);
	  driver.findElement(By.linkText("MyFlexiPlan")).click();
	  
	  
  }
}
