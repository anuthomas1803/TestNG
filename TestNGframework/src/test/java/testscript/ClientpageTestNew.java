package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.ClientPage;
import Pages.LoginPage;

public class ClientpageTestNew extends LoginpageTest {
  @Test
  public void verifyIfTheUSerIsAbleToSearchTheClientDetails() throws AWTException
  {
	  LoginPage login= new LoginPage(driver);
	  login.enter_usernamefield("carol");
	  login.enter_passwordfield("1q2w3e4r");
      login.click_loginbuton();
      
    //  driver.get("https://www.qabible.in/payrollapp/client/index");
      ClientPage client= new ClientPage(driver); 
      client.clientfield();
      client.enter_clientname("Sam");
      client.enter_clientid("3");
      client.searchbutton();
      client.resetbutton();
	 boolean isClientdetailsLoaded=client.issearchdetailsdisplayed(); 
	  assertTrue(isClientdetailsLoaded,"No results found");//actual result=expected result	  
  }
}

