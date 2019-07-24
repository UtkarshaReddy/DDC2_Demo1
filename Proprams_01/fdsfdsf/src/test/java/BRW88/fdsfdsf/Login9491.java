package BRW88.fdsfdsf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login9491 {
	WebDriver driver;
 @Test
 public void f() {
 driver.get("http://www.google.com");
	 
//	 driver.navigate().to("http://www.google.com");
	  
  }
  
  @BeforeTest
  public void beforetest() {
	  driver= Drivers23.getDriver("internet");
	  driver.manage().window().maximize();
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("hi");
//	  driver.close();
	  Select Sel1 =new Select(driver.findElement(By.name("dfadsfdsfdsfds")));
	  Sel1.selectByIndex(2);
  }
}





