package demo0408;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoadActionsDemo {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver =Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
	 WebElement El1 = driver.findElement(By.name("q"));
	 
	 Actions Act1 = new Actions(driver);
	 Act1.keyDown(El1,Keys.SHIFT).sendKeys("Accenture").keyUp(Keys.SHIFT).build().perform();
	 List<WebElement> Sgstions =driver.findElements(By.tagName("b"));
	int T_sug= Sgstions.size();
	System.out.println(T_sug);
	for(int i=0; i<T_sug-1;i++)
	{
		System.out.println(Sgstions.get(i).getText());
	}
	 Thread.sleep(5000);
//	 Act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(5000);

	 driver.close();
  }
}
