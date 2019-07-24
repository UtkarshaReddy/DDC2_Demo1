package BRW88.fdsfdsf;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo499 {
	WebDriver driver;
	
  @Test (enabled=false)
  public void f() throws InterruptedException {
	  driver=Drivers88.getDriver("IE");
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  Actions act1 = new Actions(driver);
	  
	  
	  WebElement FromELement =driver.findElement(By.xpath("/html/body/form/div[4]/div[3]/div[1]/div[2]/div/div[1]/div/div/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  WebElement ToELement =driver.findElement(By.xpath("/html/body/form/div[4]/div[3]/div[1]/div[2]/div/div[3]/div/div/table/tbody/tr/td"));
//	  act1.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add-ons')]"))).build().perform();
	  act1.dragAndDrop(FromELement, ToELement).perform();
	  Thread.sleep(50000);
	  driver.close();
  }
  
  @Test
  public void keybrd() throws InterruptedException
  {
	  driver=Drivers88.getDriver("Chrome");
//	  driver.get("http://demowebshop.tricentis.com");
	  driver.get("http://10.243.204.222:8039/TestMeApp");
	  driver.manage().window().maximize();  
	  Thread.sleep(5000);
//	 WebElement Elem1 = driver.findElement(By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]"));
//	 driver.manage().window().maximize();
	  //Actions actkb = new Actions(driver);
//	  actkb.keyDown(Elem1,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
//	  actkb.keyDown(Elem1,Keys.ALT).sendKeys("computer").keyUp(Keys.ALT).build().perform();
//	  Thread.sleep(5000);
//	  actkb.keyDown(Elem1,Keys.ALT).sendKeys("computer").keyUp(Keys.ALT).build().perform();
//	  actkb.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  
	Set<String> Handles =  driver.getWindowHandles();
//	
	for (String i : Handles)
  {
	  System.out.println(Handles.size());
	  System.out.println(i);
//	  driver.switchTo().window(i);
	}
	  
//	  if(ExpectedConditions.alertIsPresent()!=null)
//		  
//	  {
//		  Alert alr1 = driver.switchTo().alert();
//		  alr1.accept();
//	  }
	
//	for 
//	System.out.println(Handle);
//	
//	List<handles>
  }
  
  @Test(enabled= false)
 public void demoFrame()
 
  {
	  driver=Drivers88.getDriver("Chrome");
	  driver.get("http://demowebshop.tricentis.com"); 
	  
	  driver.switchTo().defaultContent();
  }
}


