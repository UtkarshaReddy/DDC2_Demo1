package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest685 {
  @Test
  public void f() {
//	  System.out.println("validations");
	  String a="Srinivas";
	  String b="Srinivas";
	  Assert.assertEquals(a, b);
//	  Assert.assertno
	  System.out.println("statements are equal");
  }
  @BeforeMethod
  public void g() {
	  System.out.println("BM");
  }
  @AfterMethod
  public void h() {
	  System.out.println("AM");
  }
}
