package demo0408;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsDemo1 {
	
	WebDriver driver;
	
  @Test
  public void login() throws InterruptedException {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // implicit wait
	  driver.get("http://newtours.demoaut.com/");
//	 System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed());
	 
	 
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo");  //username
//	  Thread.sleep(10000);  // static -- // explicit wait
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo"); //pswrd
	   // sbmt
	  WebDriverWait wait = new WebDriverWait(driver,3);   // explicit wait
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='login']")));
	  driver.findElement(By.xpath("//input[@name='Srinivaslogin']")).click(); 
//	  Wait(5)  & Exist
   }
}