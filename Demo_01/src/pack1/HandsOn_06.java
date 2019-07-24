package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandsOn_06 
{
  @Test
  public void tmethod1() 
  {
	  System.out.println("test");
  }
  @BeforeMethod
  public void tmethod2() 
  {
	  System.out.println("before method 1");
  }
  @AfterClass
  public void tmethod5() 
  {
	  System.out.println("after class 1");
  }
}
