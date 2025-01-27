package Demo_01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExtentReport_01 
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
	  public void login() 
	  {
		  test = extent.createTest("TC_01","Title Validation");
		  
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
}
