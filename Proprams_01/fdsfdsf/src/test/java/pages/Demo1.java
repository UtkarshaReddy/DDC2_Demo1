package pages;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	 WebDriver driver=null;
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();  
      driver.get("http://10.232.237.143:443/TestMeApp/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
  @Test
  public void Test() {
	  
	      driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	      driver.findElement(By.id("userName")).sendKeys("admin");
	      driver.findElement(By.id("password")).sendKeys("password456");
	      driver.findElement(By.name("Login")).click();
	      System.out.println("title of the page"+driver.getTitle());
	      Assert.assertTrue(driver.getTitle().contains("Admin Home"));
	      driver.findElement(By.xpath("/html/body/main/div/div/div/div[4]/button/h4")).click();
	      driver.findElement(By.name("categorydropname")).sendKeys("Home Appliances");
	      driver.findElement(By.name("subcategorydropname")).sendKeys("Wall Decoration");
	      driver.findElement(By.xpath("//input[@value='View Products']")).click();
	      System.out.println("message is " +driver.findElement(By.xpath("//h2[@id='demo1']")).getText());
	      WebElement objtable=driver.findElement(By.xpath("/html/body/main/div/div/div/table"));
		  List<WebElement> Allrows=objtable.findElements(By.tagName("tr"));
		  for(WebElement row : Allrows){
		  List<WebElement> cells=row.findElements(By.tagName("td"));
		  for(WebElement cell : cells){
		  System.out.println(cell.getText());
}}}
@AfterTest
private void aftertest() {
		driver.close();
	}}
