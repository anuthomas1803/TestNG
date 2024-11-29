package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.ClientPage;

public class Clientpage_Test extends Base{
  @Test
  public void verifyIfTheUSerIsAbleToSearchTheClientDetails() throws AWTException
  {
	  ClientPage search= new ClientPage(driver);
	  search.enter_usernamefield("carol");
	  search.enter_passwordfield("1q2w3e4r");
	 search.click_loginbuton();
	 search.clientfield();
	 search.enter_clientname("Sam");
	 search.enter_clientid("3");
	 search.searchbutton();
	 boolean isClientdetailsLoaded=search.issearchdetailsdisplayed(); 
	  assertTrue(isClientdetailsLoaded,"No results found");//actual result=expected result	  
  }
}
