package testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
  public WebDriver driver; //add dependencies
  @BeforeMethod
  public void beforeMethod() {
  driver=new ChromeDriver();
 driver.get("https://www.qabible.in/payrollapp/site/login");
 driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //wait is given when click doesnot work
  }

  @AfterMethod
  public void afterMethod() {
 driver.quit();
  }

}

