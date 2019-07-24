package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HandsOn_07 
{
  @BeforeMethod
  public void tmethod3() 
  {
	  System.out.println("Before method 2");
  }
  @AfterClass
  public void tmethod4() 
  {
	  System.out.println("after class 2");
  }
}
