package demo0408;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class launch701 {
	
	WebDriver Srini;
  @Test
  public void chrome() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  Srini = new ChromeDriver();
	  Srini.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
//	  Srini.navigate().to("http://www.google.com");
	  Srini.manage().window().maximize();
	  Thread.sleep(3000);
	  Dimension d= new Dimension(300,600);
	  Srini.manage().window().setSize(d);
	  Thread.sleep(3000);
	  Point p = new Point(100,200);
	  Srini.manage().window().setPosition(p);
//	  Thread.sleep(5000);
	  Srini.close();
//	  Srini.quit();
  }
  @Test(enabled=false)
  public void ie() {
	  
	  System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
	  Srini = new InternetExplorerDriver();
	  Srini.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
  }
  @Test(enabled=false)
  public void firefox() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Drivers\\geckodriver.exe");
	  Srini = new FirefoxDriver();
	  Srini.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
  }
}
