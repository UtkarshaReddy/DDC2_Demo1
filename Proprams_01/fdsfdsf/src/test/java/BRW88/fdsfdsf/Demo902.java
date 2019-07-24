package BRW88.fdsfdsf;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Demo902 {
  @Test(dataProvider = "mydata")
  public void f(Integer n, String s) {
	  System.out.println("Emp Id:"+n+"\tEMp Name:"+s);
  }

  @DataProvider
  public Object[][] mydata() {
    return new Object[][] {
      new Object[] { 11480930, "Srinivas" },
      new Object[] { 11480931, "Tester1" },
      new Object[] { 11480230, "Tester2" },
    };
  }
}
