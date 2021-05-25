package PageLibrary;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		
	public HomePage(WebDriver rdriver)
	{
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@id='rightPanel']/p")
	WebElement actualMsg;
	
	public void validateLogin(String expMsg)
	{
		String actMsg = actualMsg.getText();
		System.out.println("Message displayed is : " +actMsg);
		Assert.assertEquals("Validation failed",expMsg,actMsg);
	}

}
