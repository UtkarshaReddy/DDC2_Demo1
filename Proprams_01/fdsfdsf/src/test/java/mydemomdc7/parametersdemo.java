package mydemomdc7;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class parametersdemo {
  @Test(dataProvider = "creds")
  public void login(String Uname, String Pswrd) {
//	  System.out.println(Uname);
//	  System.out.println(Pswrd);
	  System.out.println("username is :"+Uname +" \t" + "Password is :"+Pswrd);
  }

  @DataProvider
  public Object[][] creds() {
    return new Object[][] {
      new Object[] { "demo", "demo"},
      new Object[] { "mercury", "mercury" },
      new Object[] { "Srini", "QA" },
    };
  }
}
