package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageLibrary.Base;
import PageLibrary.HomePage;
import PageLibrary.LoginPage;
import PageLibrary.RegisterPage;
import PageLibrary.testBase;

public class signUpStepDef extends Base{
	private Base tb;
	
	public signUpStepDef(Base tb)
	{
		this.tb=tb;
	}
	
	//WebDriver driver;
	
	//@Given("user clicks Register link from HomePage")
	//public void user_clicks_register_link_from_home_page() {
	  		
	//	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
	//	driver = new ChromeDriver();
	//	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	//	driver.manage().window().maximize();	
	//	 driver.findElement(By.xpath("//a[contains(@href,'register')]")).click();
		// Assert.assertEquals(", false);
		 
	//	}
	

	/*
	 * @When("user enter FirstName, LastName, Address, City, State") public void
	 * user_enter_first_name_last_name_address_city_state(DataTable table) {
	 * List<List<String>> data = table.cells();
	 * driver.findElement(By.xpath("//input[@id='customer.firstName']")).click();
	 * driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(
	 * data.get(0).get(0));
	 * driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(
	 * data.get(0).get(1));
	 * driver.findElement(By.xpath("//input[@id='customer.address.street']")).
	 * sendKeys(data.get(0).get(2));
	 * driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys
	 * (data.get(0).get(3));
	 * driver.findElement(By.xpath("//input[@id='customer.address.state']")).
	 * sendKeys(data.get(0).get(4));
	 * 
	 * }
	 */
	/*
	 * @When("enter {string}, {string}, {string}, {string}, {string}, {string}")
	 * public void enter(String zip, String phoneNum, String SSN, String uName,
	 * String pWord, String cpWord) {
	 * driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).
	 * sendKeys("51127");
	 * driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(
	 * "50471237");
	 * driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(
	 * "atc5127");
	 * driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(
	 * "bc2riley");
	 * driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(
	 * "test12");
	 * driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(
	 * "test12");
	 * 
	 * }
	 */

	/*
	 * @When("click on Register Button") public void click_on_register_button() {
	 * 
	 * driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"))
	 * .click();
	 * 
	 * }
	 */
	/*
	 * @Then("message {string} should be displayed in Welcome Page") public void
	 * message_should_be_displayed_in_welcome_page(String mes) { String expTitle =
	 * "Welcome bc2riley"; String title =
	 * driver.findElement(By.xpath("//h1[@class='title']")).getText();
	 * System.out.println("Login title : " +title);
	 * Assert.assertEquals("Invalid login",expTitle ,title); String Actualmsg =
	 * driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
	 * System.out.println("Actual message is : " +Actualmsg); //mes =
	 * driver.findElement(By.xpath("//div[@id='rightPanel']/child::h1/following::p]"
	 * )).getText(); Assert.assertEquals("validation failed",mes,Actualmsg);
	 * System.out.println("message is : " +mes); driver.close(); }
	 */
	
	
	//With examples and scenario outline, with header
	
	@Given("user clicks Register link from HomePage")
	public void user_clicks_register_link_from_home_page() {
	  		LoginPage lp = new LoginPage(tb.driver);
	  		lp.clickRegister();		 
		}	
	
	//below method used when the first 4 parameters are given 
	//without headers and in pipes and not as examples - using asLists to store the values
	@When("user enter FirstName, LastName, Address, City, State") 
	public void userEnterFirstNameLastNameAddressCityState(DataTable inputData) 
	{
		RegisterPage rp = new RegisterPage(tb.driver);
		List<List<String>> userDetails =	inputData.asLists(String.class);
		for(List<String> e: userDetails)
		{
		
		rp.enterFormValues(e.get(0),e.get(1),e.get(2),e.get(3),e.get(4));
		}
	} 
	
		/*
		 * @When("enter <Zipcode>, <PhoneNum>, <SSN>, <UserName>, <Password>, <Confirm>"
		 * ) public void enter(DataTable datas) { List<Map<String, String>> signUpForms
		 * = datas.asMaps(String.class, String.class); for (Map<String, String> x :
		 * signUpForms) {
		 * driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).
		 * sendKeys(x.get("Zipcode"));
		 * driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(
		 * x.get("PhoneNum"));
		 * driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(x.get(
		 * "SSN"));
		 * driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(x.
		 * get("UserName"));
		 * driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(x.
		 * get("Password"));
		 * driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(x.
		 * get("Confirm")); } }
		 */
	
		/*
		 * @When("user enter FirstName, LastName, Address, City, State") public void
		 * user_enter_first_name_last_name_address_city_state(DataTable table) {
		 * List<List<String>> data = table.cells();
		 * //driver.findElement(By.xpath("//input[@id='customer.firstName']")).click();
		 * for(List<String> e: data) {
		 *  String fNameHeader = e.get(0);
		 *   String lNameHeader
		 * = e.get(1); String streetHeader = e.get(2); String cityHeader = e.get(3);
		 * String stateHeader = e.get(4);
		 * driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(
		 * fNameHeader);
		 * driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(
		 * lNameHeader);
		 * driver.findElement(By.xpath("//input[@id='customer.address.street']")).
		 * sendKeys(streetHeader);
		 * driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys
		 * (cityHeader);
		 * driver.findElement(By.xpath("//input[@id='customer.address.state']")).
		 * sendKeys(stateHeader); } }
		 */
	  
		/*
		 * @When("enter {string}, {string}, {string}, {string}, {string}, {string}")
		 * public void enter(DataTable rTable) { List<List<String>> data1 =
		 * rTable.cells(); for(List<String> e: data1) {
		 * 
		 * driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).
		 * sendKeys(e.get(0));
		 * driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(
		 * e.get(1));
		 * driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(
		 * e.get(2));
		 * driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(
		 * e.get(3));
		 * driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(
		 * e.get(4));
		 * driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(
		 * e.get(5)); } }
		 */
	
	//multiple row values provided in pipes with header and not as scenario outline with examples
	@When("user enter the FirstName, LastName with Header and getting the data using Class objects")
	public void user_enter_the_first_name_last_name_with_header_and_getting_the_data_using_class_objects(DataTable userInfo) {
		List<Map<String,String>> data =userInfo.asMaps(String.class, String.class);
		RegisterPage rp = new RegisterPage(tb.driver);
				for(Map<String,String> e: data)
		{
			System.out.println("first value is : " +data.get(0).get("FirstName"));
			rp.enterAllValues(e.get("FirstName"),e.get("LastName"),e.get("Address"),e.get("City"),
					e.get("State"),e.get("Zipcode"),e.get("PhoneNo"),e.get("SSN"),e.get("UserName"),
					e.get("Password"),e.get("Confirm"));
		}
	}
	
	//below code is when there are examples and scenario outline - values in examples
	//are directly passed to the function	
	/*
	 * @When("enter {string}, {string}, {string}, {string}, {string},{string}")
	 * public void enter(String zipcode, String PhoneNum, String SSN, String
	 * UserName, String Password, String Confirm) {
	 *  RegisterPage rp = new
	 * RegisterPage(tb.driver);
	 * rp.enterInput(zipcode,PhoneNum,SSN,UserName,Password,Confirm);
	 * 	 * }
	 */
	
		  @When("click on Register Button") 
		  public void click_on_register_button() {
				 
			 tb.driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"))
			 .click();			
			 }
		 
		   @Then("message {string} should be displayed in Welcome Page")
		   public void  message_should_be_displayed_in_welcome_page(String expMsg) { 
			   HomePage hp= new HomePage(tb.driver);
				hp.validateLogin(expMsg);	   
			   
			 }

}
