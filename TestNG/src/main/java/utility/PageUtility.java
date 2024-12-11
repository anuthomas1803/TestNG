package utility;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	public WebDriver driver;

public void selectByIndex(WebElement dropdown,int index)

{

	Select drop=new Select(dropdown);

	drop.selectByIndex(index);
}

}