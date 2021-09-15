package picostepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PicoContainerStepDefinations {
	
WebDriver driver;

public PicoContainerStepDefinations(SharedClass share)
{
	driver=share.driver;
}
	@When("^user enter product name$")
	public void user_enter_product_name() throws Throwable {
	   driver.findElement(By.name("q")).sendKeys("Mobiles");
	}

	@Then("^check text present in google search box$")
	public void check_text_present_in_google_search_box() throws Throwable {
		String text= driver.findElement(By.name("q")).getAttribute("value");
	    Assert.assertEquals("Mobiles", text);
	}

	

	@When("^hit enter$")
	public void hit_enter() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  
	}
}
