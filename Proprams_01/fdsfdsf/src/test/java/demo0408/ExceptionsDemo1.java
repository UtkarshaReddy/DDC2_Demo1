package demo0408;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionsDemo1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
	  driver.findElement(By.name("login")).click();
//	  try
//	  {
//	  Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
//	  }
//	  catch (exception e)
//	  if((e.getMessage().equals)= " ")
//	  {
////		  fdsfdsf
////		  fdfd 
////		  fdsf
//	  }
//	  else
//		  
//	  System.out.println("its wrkng");
	  
  }
}
