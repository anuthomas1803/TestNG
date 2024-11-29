package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPage {
public WebDriver driver;

public ClientPage(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver,this);
}

@FindBy(id="loginform-username") WebElement username;
@FindBy(id="loginform-password") WebElement password;
@FindBy(xpath="//button[@class='btn btn-default']") WebElement loginbuttn;

	@FindBy(xpath="//a[@href='/payrollapp/client/index']") WebElement client;
	@FindBy(xpath="//input[@id='clientsearch-client_name']") WebElement clientname;
	@FindBy(xpath="//input[@id='clientsearch-id']") WebElement clientid; 
	@FindBy(xpath="//button[text()='Search']") WebElement searchoption;
	@FindBy(xpath="//button[@type='reset']") WebElement Reset;
	public void enter_usernamefield(String usernamefield)
	{
		username.sendKeys(usernamefield);
	}
	public void enter_passwordfield(String passwordfield)
	{
		password.sendKeys(passwordfield);
	}
	public void click_loginbuton() throws AWTException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); //wait upto 10sec to load. stops as soon as the actions takes place.
		wait.until(ExpectedConditions.elementToBeClickable(loginbuttn));
		loginbuttn.click();
	}

public void clientfield()
{
	client.click();
	
}
public void enter_clientname(String clientnamefield)
{
	clientname.click();
	clientname.sendKeys(clientnamefield);
}
public void enter_clientid(String clientidfield)
{
	clientid.click();
	clientid.sendKeys(clientidfield);
}
public void searchbutton() throws AWTException
{
	searchoption.click();
	Robot robot=new Robot();
	robot.delay(1000);

}
public boolean  issearchdetailsdisplayed()
{
	return searchoption.isDisplayed();
}
public void resetbutton() {
	Reset.click();
	
}
}