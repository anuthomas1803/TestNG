package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
  @Test
  public void f() {
	  System.out.println("This method prints next");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This method prints first");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This method prints at last");
  }

}
