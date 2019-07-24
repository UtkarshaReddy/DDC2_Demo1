package demo0408;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DpDemo1 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, boolean b) {
	  System.out.println("userID is:"+n+"\t Username is :"+s+b);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Srinivas", true },
      new Object[] { 2, "LKM",true },
      new Object[] { 3, "HYD" , false},
      new Object[] { 4, "HDC", true },
      new Object[] { 5, "CYBER", false },
      new Object[] { 6, "City" , true},
    };
  }
}
