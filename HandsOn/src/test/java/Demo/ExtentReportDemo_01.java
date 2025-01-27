package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class ExtentReportDemo_01 
{
  WebDriver driver;
  ExtentHtmlReporter htmlReporter;
  ExtentReports extent;
  ExtentTest test;
  
  //@Parameters({ "OS" , "browser" })
  @BeforeTest
  public void startReport() 
  {
		 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
		 extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);
//		 extent.setSystemInfo("OS",OS);
//		 extent.setSystemInfo("Browser",browser);
		 //htmlReporter.config().setChartVisibilityOnOpen(true);
		 htmlReporter.config().setDocumentTitle("Extent Report Demo");
		 htmlReporter.config().setReportName("Test Report");
		 //htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 htmlReporter.config().setTheme(Theme.STANDARD);
		 htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
  }

//  @Test
//  public void login() 
//  {
//	  test = extent.createTest("TC_01","Title Validation");
//	  WebDriver driver;
//	  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
//	  driver = new FirefoxDriver();
//	  driver.get("http://www.google.com");
//	  driver.manage().window().maximize();
//	  String Expected_title = "Name";
//	  String Actual_title = driver.getTitle();
//	  Assert.assertEquals(Actual_title,Expected_title);
//	  System.out.println("titles matching");
//  }
  @Test
  public void validating() 
  {
	  test = extent.createTest("TC_01","Title Validation");
	  Assert.assertEquals("11","11");
	  System.out.println("numbers are matching");
  }
  @AfterMethod
  public void getResult(ITestResult result) throws IOException
  {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"FAILED", ExtentColor.RED));
		  TakesScreenshot snapshot = (TakesScreenshot)driver;
		  File src = snapshot.getScreenshotAs(OutputType.FILE);
		  String Path = System.getProperty("user.dir") +"/test-output/screens/"+result.getName()+".png";
		  FileUtils.copyFile(src,new File(Path));
		  test.fail(result.getThrowable());
	  }
	  else if(result.getStatus() == ITestResult.SUCCESS)
	  {
		  test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"PASSED", ExtentColor.GREEN));
	  }
	  else
	  {
		  test.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"SKIPPED", ExtentColor.ORANGE));
		  test.skip (result.getThrowable());
	  } 
  }

  @AfterTest
  public void afterTest() 
  {
	  extent.flush();
  }

}
