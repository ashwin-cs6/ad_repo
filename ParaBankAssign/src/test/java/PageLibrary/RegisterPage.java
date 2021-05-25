package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	public RegisterPage(WebDriver rdriver)
	{
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	WebElement fName;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	WebElement lName;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	WebElement city;

	@FindBy(xpath="//input[@id='customer.address.state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	WebElement phoneNo;
	
	@FindBy(xpath="//input[@id='customer.ssn']")
	WebElement SSN;
	
	@FindBy(xpath="//input[@id='customer.username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='customer.password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	WebElement confirmPassword;
	
	public void enterFormValues(String firstName,String lastName,String add,String cityN,String stateN)
	{
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		address.sendKeys(add);
		city.sendKeys(cityN);
		state.sendKeys(stateN);
	
	}
	public void enterInput(String zip,String phone,String ssn,String uName,String pw,String cpw)
	{
		zipCode.sendKeys(zip);
		phoneNo.sendKeys(phone); 
		SSN.sendKeys(ssn);
		userName.sendKeys(uName);
		password.sendKeys(pw);
		confirmPassword.sendKeys(cpw);
	}
	
	public void enterAllValues(String firstName,String lastName,String add,String cityN,String stateN,String zip,String phone,
			String ssn,String uName,String pw,String cpw)
	{
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		address.sendKeys(add);
		city.sendKeys(cityN);
		state.sendKeys(stateN);
		zipCode.sendKeys(zip);
		phoneNo.sendKeys(phone); 
		SSN.sendKeys(ssn);
		userName.sendKeys(uName);
		password.sendKeys(pw);
		confirmPassword.sendKeys(cpw);
		
	}
}
