package pack1;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProgram_01 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Dimension d= new Dimension(330,900);
		//driver.manage().window().setSize(d);
		//driver.close();
		//driver.quit();
		WebElement Uname = driver.findElement(By.name("userName"));
		WebElement pswd = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.name("login"));
		Uname.sendKeys("demo");
		pswd.sendKeys("demo");
		submit.click();
		driver.close();
	}
}
