package BRW88.fdsfdsf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo601Ke {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver=Drivers88.getDriver("Chrome");
	  driver.get("https://www.google.com");
	  WebElement E1 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	  Actions Act1 = new Actions(driver);
	  Act1.keyDown(E1,Keys.SHIFT).sendKeys("Accenture").keyUp(Keys.SHIFT).build().perform();
	  Act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	  Thread.sleep(5000);
	  Act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform(); 
	  Thread.sleep(10000);
	  driver.close();
  
  }
}
