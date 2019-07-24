package testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Dtours2 {
  
 WebDriver driver;
	@Test(dataProvider = "dp")
	 public void f(String name, String pswrd) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("userName")).sendKeys(name);
		  driver.findElement(By.name("password")).sendKeys(pswrd);
		 
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(5000);
		  String A_title = driver.getTitle();
		  String E_title = "Find a Flight: Mercury Tours:";
		  Assert.assertEquals(A_title, E_title);
		  driver.close();
//		 if(A_title.equals(E_title))
//		 {
//			 System.out.println("lgn success");
//		 }
//		 else
//			 System.out.println("login fail");
	  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
      new Object[] { "Srinivas", "Pass123" },
    };
  }
}
