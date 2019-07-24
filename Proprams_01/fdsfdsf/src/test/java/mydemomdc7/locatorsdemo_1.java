package mydemomdc7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class locatorsdemo_1 {
	WebDriver driver;
  @Test  
  public void f() throws InterruptedException {

	  driver= Drivers321.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //exist but applicable to all the lines below
//	  driver.findElement(By.linkText("REGISTER")).click();
	  WebDriverWait wait = new  WebDriverWait(driver,50);
//	   Object expectedCondtions;
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='REGISTER']")));
	  driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
//	  Thread.sleep(10000);  // wait
//	  driver.findElement(By.name("firstName")).sendKeys("SriniGodari");
	  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("SriniGodari");
	
//	  driver.findElement(By.id("userName")).sendKeys("SriniGodari99");
////	  driver.findElement(By.className("dsfds")).sendKeys("SriniGodari99");
	  WebElement Cntry =driver.findElement(By.xpath("//select[@name=\"country\"]"));
	   Select Sel1 = new Select(Cntry);
//	   Sel1.selectByIndex(2);
//	   Sel1.selectByVisibleText("INDIA");
	   Sel1.selectByValue("251");
  }
  private Object located(By xpath) {
	// TODO Auto-generated method stub
	return null;
}
@Test (enabled= false)
  public void g() {

	  driver= Drivers321.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com/");
	  List<WebElement> x = driver.findElements(By.tagName("table"));
	  int t_link_count = x.size();
	  System.out.println(t_link_count);
	  for (int i=0; i<t_link_count;i++)
	  {
		 String link= x.get(i).getText();
		 System.out.println(link);
	  }
  }
  @Test(enabled= false)
  public void h() {

	  driver= Drivers321.getDriver("firefox");
	  driver.get("http://www.msn.com");
  }
}
