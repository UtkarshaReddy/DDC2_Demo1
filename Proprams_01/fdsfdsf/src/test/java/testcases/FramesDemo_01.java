package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramesDemo_01 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
   driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
////	  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
////    driver.findElement(By.xpath("//button[text()='Try it']")).click();
////    String S =   driver.switchTo().alert().getText();
	  WebElement SRC_El =driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  WebElement DSt_El =driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
//	  WebElement El1 =driver.findElement(By.xpath("//b[text()='sign-in here']"));
//	  //*[@id="ctl00_ContentPlaceholder1_RadGrid1_ctl00"]/tbody/tr/td
	  Actions act1 = new Actions(driver);
	  
//	  act1(El1).build().perform();
//	  act1.dragAndDrop(SRC_El, DSt_El).build().perform();
	  act1.clickAndHold(SRC_El).release(DSt_El).build().perform();
//	  
//      act1.moveToElement(El1).build().perform();
//	System.out.println(S);
//	driver.switchTo().alert().accept();
//	driver.switchTo().defaultContent();
//	  System.out.println(driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText());
//      driver.close();
  }
}
