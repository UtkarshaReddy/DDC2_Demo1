package mydemomdc7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Dem0_2 {
	WebDriver driver;
	
  @Test(enabled= false)
  public void mouse_hover() {
	  driver = Drivers321.getDriver("chrome");
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	  WebElement T_elemnt =driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  Actions Act1 = new Actions(driver);
//	  Act1.moveToElement(T_elemnt).perform();
  }
  @Test
  public void scroll_down() {
	  driver = Drivers321.getDriver("chrome");
	  driver.get("http://learn-automation.com/scroll-page-in-selenium-webdriver/");
	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	  WebElement T_elemnt =driver.findElement(By.xpath("//a[text()='Add-Ons']"));
//	  Actions Act1 = new Actions(driver);
//	  Act1.moveToElement(T_elemnt).perform();
	  ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
	  
  }
}
