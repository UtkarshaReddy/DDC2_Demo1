package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo");  //uname
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");  // pswrd
////		driver.findElement(By.xpath("//input[@name='login']")).click();  //submit
//		String A_title = driver.getTitle();
//		System.out.println(A_title);
//		String Text =driver.findElement(By.xpath("//a[text()='REGISTER']")).getText();
//		System.out.println(Text);
//		String E_Title ="Find a Flight: Mercury Tours: ";
//		if (A_title.equals(E_Title))
//		{
//			System.out.println("login success");
//		}
////		else
////		{
////			System.out.println("login failure as the page taking too long");
////		}
////		}
//		List<WebElement> T_links =driver.findElements(By.tagName("a"));
//		int Cnt_links = T_links.size();
//		System.out.println(Cnt_links);
//		
//	for(int i=0;i<Cnt_links;i++)
//	{
//		String Links = T_links.get(i).getText();
//		System.out.println(Links);
//	}
//		
//	}
		
		driver.findElement(By.cssSelector("input#lhklhl")).sendKeys("Srinivas");
		driver.findElement(By.cssSelector("input.lkjdfkjd")).sendKeys("Password1234");
	}
	

}
