package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProgram_05
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
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignUp")));
		driver.findElement(By.xpath("//a[contains (text( ),'SignUp')]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ljgdaouteq");
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("fvjcBHdv");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("dfbdfhdh");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mnbvcxz");
	    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("mnbvcxz");
	    driver.findElement(By.xpath("//input[@value='Male']")).click();
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nzdndzrzdn@gmail.com");
	    driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("07/17/2019");
	    driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(" ffgdfhdjtjtgjfyjfg");
	    WebElement question =  driver.findElement(By.xpath("//select[@name='securityQuestion']"));
	    Select Ques1 = new Select(question);
		Ques1.selectByIndex(1);
	    driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("Black");
	    driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
