package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProgram_02 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		WebElement signin = driver.findElement(By.name("SignIn"));
		WebElement uname = driver.findElement(By.name("userName"));
		WebElement pswd = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("Login"));
		Thread.sleep(5000);
		signin.click();
		uname.sendKeys("mbczkhfs");
		pswd.sendKeys("mnbvcxz");
		login.click();
		driver.close();

	}

}
