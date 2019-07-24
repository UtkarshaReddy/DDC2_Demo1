package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProgram_06 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		driver.findElement(By.xpath("//a[contains (text( ),'SignIn')]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mbczkhfs");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mnbvcxz");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(5000);
		List<WebElement> T_links = driver.findElements(By.tagName("a"));
		int count = T_links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String link = T_links.get(i).getText();
			System.out.println(link);	
		}
		driver.close();
	}

}
