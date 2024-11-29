package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginpageTest extends Base{

  @Test
  @Parameters({"username","password"})
  public void verifyUserIsAbleToLoginValidCredenstials(String username,String password) throws AWTException
 {
	  //object creation of login page
	  LoginPage login=new LoginPage(driver);
	  login.enter_usernamefield(username);
	  login.enter_passwordfield(password);
	  login.click_loginbuton();
	  boolean isHomepageLoaded=login.isDashBoardLoaded(); 
	  assertTrue(isHomepageLoaded,"Invalid credentials!!home page not loaded");//actual result=expected result
 }
  
  
@DataProvider(name="credentials")
public Object[][] testData()        //Object is a class
{
Object data[][]= {{"carol","1q2w3e4r"},{"anu","1q993e4r"},{"shefeena","19dte4r"}};	
return data; 
}
 

@Test(dataProvider = "credentials")
  
public void userIsAbleTologininDataProvider(String username,String password) throws Exception
{
	LoginPage login=new LoginPage(driver);
	  login.enter_usernamefield(username);
	  login.enter_passwordfield(password);
	  login.click_loginbuton();
	  boolean isHomepageLoaded=login.isDashBoardLoaded(); 
	  assertTrue(isHomepageLoaded,"Invalid credentials!!home page not loaded");//actual result=expected result
}
	
}
