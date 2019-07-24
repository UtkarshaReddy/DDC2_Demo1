package demo0408;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AlertsDemo1 {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver = Driver123.getDriver("chrome");
	  driver.get("https://tsrtconline.in/oprs-web/");
	  driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	  Thread.sleep(3000);
//	  if(ExpectedConditions.alertIsPresent()!=null)
//	  {
		Alert alrt1=  driver.switchTo().alert();
		alrt1.getText();
//		alrt1.accept();
		System.out.println("alerts present");
		System.out.println(alrt1.getText());
		alrt1.dismiss();
//	  }
//	  else
//	  {
	  driver.close();
	  System.out.println("no alert present");
//	  }  
  } 
}
