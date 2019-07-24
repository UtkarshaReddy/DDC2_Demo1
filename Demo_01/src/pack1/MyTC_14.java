package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyTC_14 
{
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver;
	  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver,60);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='q']")));
	  //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Accenture");
	  WebElement e = driver.findElement(By.xpath("//input[@name='q']"));
	  Actions act1 = new Actions(driver);
	  Thread.sleep(5000);
	  
	  act1.keyDown(e,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(5000);
	  act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
  }
}
