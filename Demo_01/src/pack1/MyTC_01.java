package pack1;

import org.testng.annotations.Test;

public class MyTC_01 
{
  @Test (priority=2)
  public void Login()
  {
	  System.out.println("login");
  }
  @Test
  public void Registration() 
  {
	  System.out.println("Registration");
  }
  @Test (priority=1)
  public void Logout() 
  {
	  System.out.println("Logout");
  }
  @Test (priority=3) 
  public void AddToCart() 
  {
	  System.out.println("AddToCart");
  }
}
