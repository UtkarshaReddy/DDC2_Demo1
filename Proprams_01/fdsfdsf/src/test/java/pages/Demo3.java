package pages;

import org.testng.annotations.Test;

//import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	
	 WebDriver driver=null;
	 @BeforeTest
	 public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();  
		      driver.get("http://10.232.237.143:443/TestMeApp/");
		      driver.manage().window().maximize();
//		      driver.manage().window().
		      Dimension D = new Dimension(600,900);
		      driver.manage().window().setSize(D);
		      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	 }
  @Test
  public void test() throws InterruptedException {
	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
      driver.findElement(By.id("userName")).sendKeys("lalitha");
      driver.findElement(By.id("password")).sendKeys("password123");
      driver.findElement(By.name("Login")).click();
      System.out.println("title of the page"+driver.getTitle());
      Assert.assertTrue(driver.getTitle().contains("Home")); 
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  Alert alt=driver.switchTo().alert();
	  System.out.println("alert text is "+alt.getText());
	  alt.accept();
	  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Summer wear");
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
      driver.findElement(By.xpath("//a[contains(text(), 'Add to cart')]")).click();
      driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  WebElement radio1=driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label"));
	  radio1.click();
	  driver.findElement(By.xpath("//a[@id='btn']")).click();
	  driver.findElement(By.name("username")).sendKeys("123456");
	  driver.findElement(By.name("password")).sendKeys("Pass@456");
	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	  driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	  driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	  
  }
  
  @AfterTest
  private void aftertest() {
  	driver.close();
}
}
