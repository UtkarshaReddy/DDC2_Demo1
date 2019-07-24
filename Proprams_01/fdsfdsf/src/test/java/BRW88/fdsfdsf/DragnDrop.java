package BRW88.fdsfdsf;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragnDrop {
  WebDriver driver;
  @BeforeMethod
  public void brw()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
//	  driver.manage().deleteAllCookies();
//	  Dimension n = new Dimension(300,600);
//	  driver.manage().window().setSize(n);
  }
  @Test
  public void logn() {
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
	  WebElement to=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
	  Actions MyAct1= new Actions(driver);
	  MyAct1.dragAndDrop(from, to).build().perform();

	 Set<String> allwindows =driver.getWindowHandles();
	 int a = allwindows.size();
//	 
//	 Select Sel1=new Select(driver.findElement(By.name("DateOfBirth")));
//     Sel1.selectByValue("daf");
	 System.out.println("Total no of window count is:"+ a);
	 
  }
}
