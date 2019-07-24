package mydemomdc7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class launch_01 {
	WebDriver driver;
	
  @Test
  public void login() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("http://newtours.demoaut.com");
//	  driver.navigate().to("URL");
	  driver.findElement(By.name("userName")).sendKeys("demo");
	  driver.findElement(By.name("password")).sendKeys("demo");
	  Thread.sleep(5000);
	  driver.findElement(By.name("login")).click();
  }
  @Test
  public void validation()
  {
	 String A_title = driver.getTitle();
	 String E_title = "Srinivas Godari";
//	 if(A_title.equals(E_title))
//	 {
//		System.out.println("login success"); 
//	 }
//	 else
//	 {
//		 System.out.println("login failure");
//	 }
	 System.out.println("A_title");
	 Assert.assertEquals(A_title, E_title);
	 System.out.println("login success");
	 }
  }
  
  

