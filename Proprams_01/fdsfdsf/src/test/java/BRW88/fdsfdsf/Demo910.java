package BRW88.fdsfdsf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo910 {
  
  WebDriver driver;
  @Test
  
  public void f() throws InterruptedException {
	  driver=Drivers99.getDriver("ccc");
	  driver.get("https://book.spicejet.com/");
//	  driver.findElement(By.cssSelector("img[hieght='34']")).sendKeys("df");
//	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	 WebDriverWait x = new WebDriverWait(driver,20);
//	 x.until(ExpectedConditions.p)
	  Actions act1 = new Actions(driver);
	  act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
//	  Thread.setDefaultUncaughtExceptionHandler();
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"header-addons\"]/ul/li[10]/a")).click();
	
	  
	  
	  
	  
	  
	  
	  
  }
}
