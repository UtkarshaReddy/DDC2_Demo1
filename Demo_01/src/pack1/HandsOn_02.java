package pack1;

import org.testng.annotations.Test;

public class HandsOn_02 
{
  @Test (priority=2)
  public void testGoogle() 
  {
	  System.out.println("Google Test");
  }
  @Test (priority=1)
  public void testTwitter() 
  {
	  System.out.println("Twitter Test");
  }
  @Test (priority=3,enabled = false)
  public void testFacebook() 
  {
	  System.out.println("Facebook Test");
  }
}
