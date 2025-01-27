package testing_01;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExtentReportDemo_01 
{
  WebDriver driver;
  ExtentHtmlReporter htmlReporter;
  ExtentReports extent;
  ExtentTest test;
  @BeforeTest
  public void startReport(String OS,String browser) 
  {
		 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
		 extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);
		 extent.setSystemInfo("OS",OS);
		 extent.setSystemInfo("Browser",browser);
		 //htmlReporter.config().setChartVisibilityOnOpen(true);
		 htmlReporter.config().setDocumentTitle("Extent Report Demo");
		 htmlReporter.config().setReportName("Test Report");
		 //htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 htmlReporter.config().setTheme(Theme.STANDARD);
		 htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
  }

  @Test
  public void f() 
  {
	  
  }
  @AfterMethod
  public void getResult(ITestResult result) throws IOException 
  {
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}