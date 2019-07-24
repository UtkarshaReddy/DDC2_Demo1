package pages;
// base class
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 
		WebDriver driver;
			By user=By.name("userName");  // allocating the Webelement to By class instance
			By pass=By.name("password");  // By is a class here
			By signinBtn=By.name("login");	
			By Home_link=By.linkText("Home");
			public LoginPage(WebDriver driver) {
				this.driver=driver;  // passing the webdriver as an argument to the constructor
				                     // intial set up values  (which auto intialised) EX: AADHAR NUM, -- NAME, DOB
				                    //  this keywaord helps us to connect to the other webdriver classes
				}	
			public void setUser() {
				driver.findElement(user).sendKeys("demo");
			}	
			public void setPass() {
				driver.findElement(pass).sendKeys("demo");				
			}	
			public void clickLogin() {
				driver.findElement(signinBtn).click();
				
			}
			public void clickHome() {
				driver.findElement(Home_link).click();
			}
}
