package BRW88.fdsfdsf;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover1 {
	WebDriver driver;
	
	@BeforeMethod
	  public void brw()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		  driver =new ChromeDriver();
	  }
	  @Test
	  public void logn() throws InterruptedException {
		  driver.get("https://www.spicejet.com/");
		  driver.manage().window().maximize();
//		  Dimension n= new Dimension(300,900);
//		  driver.manage().window().setSize(n);
		  Actions Act1= new Actions(driver);
		  Act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("MyFlexiPlan")).click();
  }
}
