package pages;

import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
WebDriver driver=null;	
@BeforeTest()
	public void beforetest() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();  
      driver.get("http://localhost:8090/TestMeApp2.2/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	
  @Test
  public void test() {
	  
	      driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	      driver.findElement(By.id("userName")).sendKeys("admin");
	      driver.findElement(By.id("password")).sendKeys("password456");
	      driver.findElement(By.name("Login")).click();
	      System.out.println("title of the page"+driver.getTitle());
	      Assert.assertTrue(driver.getTitle().contains("Admin Home"));
	      driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
	      driver.findElement(By.name("categorydropname")).sendKeys("Electronics");
	      driver.findElement(By.name("subcategorydropname")).sendKeys("Head Phone");
	      driver.findElement(By.name("prodname")).sendKeys("Samsung");
	      driver.findElement(By.name("pricename")).sendKeys("500");
	      driver.findElement(By.name("Quantity")).sendKeys("2");
	      driver.findElement(By.name("Brand")).sendKeys("EG920");
	      driver.findElement(By.id("description")).sendKeys("this is branded head phone");
	      driver.findElement(By.name("input-file-preview")).sendKeys("C:\\Users\\srinivas.godari\\Desktop\\Sel Quiz\\Selenium_QP's\\Selenium_QP's\\Selenium_QP_2\\Headphone.png");
	      driver.findElement(By.name("Add Product")).click();
	      System.out.println("message is"+driver.findElement(By.xpath("/html/body/main/div/div/div/form/b/i")).getText());
	      
  }
  @AfterTest()
	  public void aftertest() {
	  driver.close();
		  
	  }
  }
  
 
