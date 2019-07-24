package BRW88.fdsfdsf;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.javashared.infra.Security.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.DataProvider;

public class DragAndDrop2 {
	WebDriver driver;
	
@BeforeMethod
public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
  @Test
  public void dd() throws InterruptedException {
	  driver.get("http://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
	  Thread.sleep(5000);
	  WebElement a=driver.findElement(By.cssSelector("img[alt='On top of Kozi kopka']"));
	  WebElement b=driver.findElement(By.xpath("//*[@id=\"trash\"]")); 
	  Actions Act3 = new Actions(driver);
	  Act3.dragAndDrop(a, b).build().perform();
  }


  }

