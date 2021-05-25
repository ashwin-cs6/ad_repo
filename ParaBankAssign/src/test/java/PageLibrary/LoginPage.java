package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		//ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(@href,'register')]")
	WebElement registerLink;
	
	public void clickRegister()
	{
		registerLink.click();
	}

}
