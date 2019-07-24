package BRW88.fdsfdsf;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class Demo801 {
	
WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String name, String pswrd) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver=  new ChromeDriver();  
	  driver.get("http://www.newtours.demoaut.com");
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("email")).sendKeys(name);
	  driver.findElement(By.name("password")).sendKeys(pswrd);
	  driver.findElement(By.name("confirmPassword")).sendKeys(pswrd);
	  driver.findElement(By.name("register")).click();
	  Thread.sleep(5000);
//	  String S = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
//	  System.out.println(S);
	  
//	  WebDriverWait wait = new WebDriverWait(driver,20);
//	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
//  }
 
	  
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Srinivas", "test21" },
      new Object[] { "QAtest", "testts56" },
    };
  }
}
