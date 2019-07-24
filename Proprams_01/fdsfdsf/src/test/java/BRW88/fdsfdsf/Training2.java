package BRW88.fdsfdsf;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Training2 {
	WebDriver TestMe;
  @BeforeMethod
  public void launch()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  TestMe = new ChromeDriver();
  }
  @Test(dataProvider = "credentials")
  public void login(String Uname, String Pswrd) throws InterruptedException {
//	  System.out.println("username:"+Uname+"password:"+Pswrd);
	  TestMe.get("http://10.211.154.58:8083/TestMeApp");
	  Thread.sleep(5000);
	  TestMe.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  TestMe.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(Uname);
	  TestMe.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Pswrd);
	  Thread.sleep(3000);
	  TestMe.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();  
	 String a=  TestMe.getTitle();
     System.out.println("Login Success & Title is:" +a);
	TestMe.close();
  }
  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "lalitha", "Password123" },
      new Object[] { "admin", "Password456" },
      new Object[] { "Srinivas", "LKMHYD" },
    };
  }
}
