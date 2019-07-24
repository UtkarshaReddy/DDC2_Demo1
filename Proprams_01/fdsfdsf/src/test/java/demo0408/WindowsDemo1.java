package demo0408;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowsDemo1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver= Driver123.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	  String P_window =driver.getWindowHandle();
	  Set<String> T_Windows = driver.getWindowHandles();
	  int TNo_windows =T_Windows.size();
//	  T_Windows.iterator().
	  System.out.println(TNo_windows);
	  for (String  S: T_Windows)
	  {
		  System.out.println(S);
		  driver.switchTo().window(S);
	  }
	  System.out.println(driver.getTitle());
	  driver.switchTo().window(P_window);
	  System.out.println(driver.getTitle());
//	  driver.close();

  }
  
}
