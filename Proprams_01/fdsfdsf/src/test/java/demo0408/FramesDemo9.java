package demo0408;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FramesDemo9 {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
	  driver.manage().window().maximize();
//	  driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  Alert altr1 = driver.switchTo().alert();
	  altr1.accept();
	  driver.switchTo().defaultContent();
	  String S1 =driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText();
	  System.out.println(S1);
	  
//	  driver.close();
  }
}
