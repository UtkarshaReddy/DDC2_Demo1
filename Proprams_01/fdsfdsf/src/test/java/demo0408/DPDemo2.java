package demo0408;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DPDemo2 {
	
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String S1, String S2) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");  
	driver = new ChromeDriver();
	driver.get("https://agents.tsrtconline.in/tsrtc-oprs/");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[2]/td/table/tbody/tr/th/table/tbody/tr[4]/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys(S1);   //uname
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[2]/td/table/tbody/tr/th/table/tbody/tr[4]/td/table[2]/tbody/tr[2]/td[2]/input")).sendKeys(S2);  // pswrd
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[2]/td/table/tbody/tr/th/table/tbody/tr[4]/td/table[2]/tbody/tr[3]/td[2]/input[1]")).click();
  String Title=   driver.getTitle();
  System.out.println(Title);
//  if(Title.equals("TSRTC-Home"))
//  {
//  System.out.println("login success");
//  }
//  else
//  {
//	  System.out.println("login Failure invalid Cred");
//  }
  Assert.assertEquals("TSRTC-OPRS", Title);   // true
  System.out.println("Hi Srinivas");
 }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Srinivas", "Pass4646" },
      new Object[] { "Qatester", "Pass56465" },
    };
  }
}
