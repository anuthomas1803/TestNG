package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v128.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
 public WebDriver driver;
	                       //@FindBy : annotation-pom with pagefactory
	                     //pom without page factory findElement()
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;  
		PageFactory.initElements(driver,this);// for using findBy annotation
		
		//classname.methodName
	}
	@FindBy(id="loginform-username") WebElement username;
	@FindBy(id="loginform-password") WebElement password;
	@FindBy(xpath="//button[@class='btn btn-default']") WebElement loginbuttn;
	@FindBy(xpath="//a[@href='/payrollapp/site/index']") WebElement dashboard;

	public void enter_usernamefield(String usernamefield)
{
	username.sendKeys(usernamefield);
}
public void enter_passwordfield(String passwordfield)
{
	password.sendKeys(passwordfield);
}

public void click_loginbuton() 
{
	// TODO Auto-generated method stub
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); //wait upto 10sec to load. stops as soon as the actions takes place.
	wait.until(ExpectedConditions.elementToBeClickable(loginbuttn));
	loginbuttn.click();
	
}
public boolean isDashBoardLoaded()
{
	return dashboard.isDisplayed();

	// OR dashboard.isDisplayed(); return isDashBoardLoaded();
}}