package demo0408;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LocatorsDemo1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver= Driver123.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
//	 WebElement R_link = driver.findElement(By.linkText("REGISTER"));
//	 R_link.click();
//	 
   driver.findElement(By.linkText("REGISTER")).click();
//	 driver.findElement(By.partialLinkText("REGI")).click();
//	 driver.findElement(By.name("firstName")).sendKeys("Srinivas");
//	 
//	 driver.findElement(By.id("userName")).sendKeys("Srini@test.com");
////	 driver.findElement(By.className("testts")).sendKeys("Srini@test.com");
//	 
//	 Select Sel1 = new Select(driver.findElement(By.name("country")));
////	 Sel1.selectByIndex(2);
////	 Sel1.selectByValue("251");
//	 Sel1.selectByVisibleText("TOGO");
	  
//	List<WebElement> Tlinks= driver.findElements(By.tagName("a"));
//	int Noof_links =Tlinks.size();
//	System.out.println(Noof_links);
//	for (int i=0;i<Noof_links-1;i++)
//	{
//		System.out.println(Tlinks.get(i).getText());
//	}
	  
	  driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("srinivas"); // using attributes
	  driver.findElement(By.cssSelector("input#email")).sendKeys("HYD");  // using ID  (tagname#id)
	  driver.findElement(By.cssSelector("input.")).sendKeys("HYD");  // using Class (tagname.class)
  }
}
