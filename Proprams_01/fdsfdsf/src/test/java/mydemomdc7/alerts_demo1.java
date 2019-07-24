package mydemomdc7;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class alerts_demo1 {
	WebDriver driver;
	
  @Test (enabled= false)
  public void alerts_Demo() {
	  driver = Drivers321.getDriver("chrome");
	  driver.get("C:\\Users\\srinivas.godari\\Desktop\\UFT_MDC_May\\demoscript.html");
	  driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	  if(ExpectedConditions.alertIsPresent() != null)
	  {
		  Alert altr =  driver.switchTo().alert();
//		  Alert altr =  driver.switchTo().alert();
		  String altr_msg= altr.getText();
		  System.out.println(altr_msg);
		  altr.accept();
	  }
	  else
	  {
		System.out.println(" no alerts are present in the page");  
	  }
	 
//	  altr.accept();
//	  altr.dismiss();
		  driver.findElement(By.xpath("//a[text()=' Browse ']")).click();
  }
  
  @Test (enabled= false)
  public void frames_demo()
  {
	  driver= Drivers321.getDriver("chrome");
	  driver.get("https://www.w3schools.com/icons/tryit.asp?filename=tryicons_awesome5");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//p[text()='Styled Font Awesome icons (size, color, and shadow):']
	  driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	  WebElement El1= driver.findElement(By.xpath("//p[contains(text(),'Styled')]"));
	  System.out.println(El1.getText());
	  driver.switchTo().defaultContent();
	  WebElement El2 =driver.findElement(By.xpath("//span[text()='Font Awesome Icons']"));
	  System.out.println(El2.getText());
	  
  }
  
  @Test
  public void windows_demo()
  {
	  driver= Drivers321.getDriver("chrome");
	  driver.get("https://retail.onlinesbi.com/retail/login.htm#");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	 String P_window = driver.getWindowHandle();
	 System.out.println(P_window);
	  Set<String> All_windows = driver.getWindowHandles();
	  int t_cnt_windows= All_windows.size();
	  System.out.println(t_cnt_windows);
	 for (String S: All_windows)
	 {
		 driver.switchTo().window(S);
		 System.out.println(driver.getWindowHandle());
		 
	 }
	  driver.findElement(By.xpath("//*[@id='parentHorizontalTab']/div[2]/div/div[1]/p[3]/a")).click();
	  driver.close();
  }
  
  }


