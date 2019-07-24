package BRW88.fdsfdsf;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class Login901 {
	
	WebDriver QATest;
	
//  @Test
//  public void Chrome() throws InterruptedException {
//	  
//	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
//	  QATest = new ChromeDriver();
//	  QATest.get("http://www.google.com");
//	  Thread.sleep(5000);
//	  QATest.close();
//	  
//  }
  @Test
  public void IE() throws InterruptedException {
	  
//	  System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
//	  QATest = new InternetExplorerDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  QATest = new ChromeDriver();
	  QATest.manage().window().maximize();
	  QATest.get("http://10.243.204.222:8039/TestMeApp/login.htm");
	  Thread.sleep(2000);
	  
//	  Dimension d = new Dimension(800,900);
//			  QATest.manage().window().setSize(d);
////			  QATest.manage().window().se;
//	  QATest.findElement(By.linkText("SignIn")).click();
//	  Thread.sleep(5000);
	  QATest.findElement(By.name("userName")).sendKeys("re564vanth");
	  QATest.findElement(By.name("password")).sendKeys("revanth123");
	  Thread.sleep(2000);
	  QATest.findElement(By.name("Login")).click();
	 String  S = QATest.getTitle();
	 if (S.equals("Home"))
		 System.out.println("Login Success");
	 else 
		 System.out.println("Login Failure invalid Creds");
	 Assert.assertEquals(S, "Home");
	 System.out.println("login Successss ok");
//	  QATest.close();
	  
//  }
//  @Test
//  public void firefox() throws InterruptedException {
//	  
//	  System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Drivers\\geckodriver.exe");
//	  QATest = new FirefoxDriver();
//	  QATest.get("http://www.google.com");
//	  Thread.sleep(5000);
//	  QATest.close();
//	  
 }
}
