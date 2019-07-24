package demo0408;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MouseHoverDemo {
	WebDriver driver;
  @Test (enabled=false)
  public void hovering() throws InterruptedException {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  Actions Act1 = new Actions(driver);
	 WebElement El1= driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	 Act1.moveToElement(El1).build().perform(); // for hovering
	 WebDriverWait wait= new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='MyFlexiPlan']")));
	 
	 Thread.sleep(5000);
    driver.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
  }
  @Test(enabled=false)
  public void doubleclick() {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  Actions Act2 = new Actions(driver);
	 WebElement El2= driver.findElement(By.xpath("//font[contains(text(),'Registered')]"));
	 Act2.doubleClick(El2).build().perform();
  }
  
  @Test(enabled=false)
  public void rightclick() {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  Actions Act2 = new Actions(driver);
	 WebElement El2= driver.findElement(By.xpath("//a[text()='Gmail']"));
	 Act2.contextClick(El2).build().perform();
  }
  @Test
  public void DragNDrop() throws InterruptedException {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  Actions Act2 = new Actions(driver);
	 WebElement src= driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	 WebElement dst= driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
	 Act2.dragAndDrop(src, dst).build().perform();
	
	 Thread.sleep(5000);
	 WebElement Amnt = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tfoot/tr/td[2]"));
	 String T_amnt= Amnt.getText();
	 System.out.println(T_amnt);
//	 Assert.assertEquals(expected, actual);
	 if(T_amnt == "$0")
	 { 
		 System.out.println("drag and drop fail");
	 }
	 else
	 {
		 System.out.println("drag and drop success");
	 }
	 }
  }