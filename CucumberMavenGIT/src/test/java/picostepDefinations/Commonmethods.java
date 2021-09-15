package picostepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Commonmethods {

	WebDriver driver;
	public Commonmethods(SharedClass share)
	{
		driver=share.driver;
	}
	@Given("^user need to be on google home page$")
	public void user_need_to_be_on_google_home_page() throws Throwable {
	    driver.get("http://www.google.com");
	}
	
	
}
