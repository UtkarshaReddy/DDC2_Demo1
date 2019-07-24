package pack1;

import org.testng.annotations.Test;

public class MyTC_06 
{
  @Test (invocationCount =10)
  public void f() 
  {
	  System.out.println(10);
  }
}
