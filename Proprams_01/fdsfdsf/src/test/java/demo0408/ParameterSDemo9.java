package demo0408;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSDemo9 {
  @Test
  @Parameters({"location", "DCNO"})
  public void login(String location, String DCNO ) 
  {
	  System.out.println("code for login");
	  System.out.println(location);
	  System.out.println(DCNO);
  }
  @Test
  @Parameters({"location", "DCNO"})
  public void logout(String location, String DCNO ) 
  {
	 
	  System.out.println("code for logout");
	  System.out.println(location);
	  System.out.println(DCNO);
  }
	 
}