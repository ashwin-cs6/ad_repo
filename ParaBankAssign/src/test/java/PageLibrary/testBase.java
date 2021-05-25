package PageLibrary;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class testBase extends Base{
	
	private Base b;
	public testBase(Base b)
	{
		this.b=b;
	}
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		b.driver = new ChromeDriver();
		b.driver.get("https://parabank.parasoft.com/parabank/index.htm");
		b.driver.manage().window().maximize();	
	}
	
	@After
	public void tearDown()
	{
		b.driver.close();
	}
}
