package BRW88.fdsfdsf;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderEx {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("Name of the employe is:"+n+"\tEmp Id:"+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 11180932, "srinivas" },
      new Object[] { 11195112, "suman" },
    };
  }
}
