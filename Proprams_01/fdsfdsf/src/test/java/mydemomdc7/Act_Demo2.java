package mydemomdc7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Act_Demo2 {
	
	WebDriver driver;
  
  @Test (enabled= false)
  public void MouseHover() {
	  driver = Drivers321.getDriver("chrome");
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  WebElement El1 =driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  Actions Act1 = new Actions(driver);
	  Act1.moveToElement(El1).build().perform(); // move to
	   }
  @Test
  public void KeY_Board() throws InterruptedException { 
	  driver = Drivers321.getDriver("chrome");
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  WebElement El2 =driver.findElement(By.xpath("//input[@name='q']"));
	  Actions Act1 = new Actions(driver);
	  Act1.keyDown(El2,Keys.SHIFT).sendKeys("Srinivas").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(5000);
	  Act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  }
}
