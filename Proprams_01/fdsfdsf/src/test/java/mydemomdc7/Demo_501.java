package mydemomdc7;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo_501 {
	
	public static void main(String[] args) throws InterruptedException     {
		// TODO Auto-generated method stub
		WebDriver Srini;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		Srini = new ChromeDriver();
		Srini.get("http://www.gmail.com");
		Srini.manage().window().maximize();
		Dimension d= new Dimension(600,900);
		Srini.manage().window().setSize(d);
		Point p = new Point(300,400);
		Srini.manage().window().setPosition(p);
		Thread.sleep(5000); // wait of UFT
		Srini.close(); // close only parent brwser window
//		Srini.quit(); //closes all the brwser instances
//		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
//		Srini = new InternetExplorerDriver();
//		Srini.get("http://www.gmail.com");
//		Thread.sleep(5000);
//		Srini.close();

	}

}
