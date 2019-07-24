package demo0408;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertsDemo9 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("file:///C:/Users/srinivas.godari/Desktop/Demo901.html");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//button[text()='Enroll']")).click();
//	  Set<String> All_windows =driver.getWindowHandles();
//	  System.out.println(All_windows.size());
	  String S= driver.getWindowHandle();
	  System.out.println(S);
	  
 Alert alrt1 =driver.switchTo().alert();
 Thread.sleep(5000);
  String S1 =alrt1.getText();
  System.out.println(S1);
  Thread.sleep(3000);
	  driver.switchTo().alert().sendKeys("11480932");
//	  alrt1.sendKeys("11480932");
// driver.findElement(By.xpath("//button[text()='Enroll']")).sendKeys("11480932");
//	  alrt1.accept();
//	  driver.findElement(By.xpath("//button[text()='Click Me Again ']")).click();
//	  System.out.println(alrt1.getText());
//	  alrt1.accept();
//	  driver.findElement(By.xpath("//button[text()='NextGen']")).click();
//	  System.out.println(alrt1.getText());
//	  alrt1.accept(); 
//	  driver.findElement(By.xpath("//button[text()='NextGen']")).click();
//	  System.out.println(alrt1.getText());
//	  alrt1.dismiss();
//	  System.out.println(alrt1.getText());
	  
  }
}
