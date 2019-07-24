package demo0408;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SelDisEn {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com/");
	 boolean b= driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed();
	 System.out.println(b);
//	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo");
//	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
//	  driver.findElement(By.name("login")).click();
	 driver.close();
  }
  @Test
  public void red() {
	  driver = Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.spicejet.com/");
	
	  boolean c=driver.findElement(By.xpath("//label[text()='Round Trip']")).isSelected();
	  System.out.println(c);
	  driver.close();
	  
  }
  @Test
  public void redbus() {
	  driver = Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.spicejet.com/");
	  boolean c=driver.findElement(By.xpath("//label[text()='Round Trip']")).isSelected();
	  System.out.println(c);	  	
	  boolean d=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).isEnabled();  
	  System.out.println(d);
	  driver.close();  
  }
}
