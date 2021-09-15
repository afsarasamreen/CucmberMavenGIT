package cucumbertagsStepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTagsSteps {
	WebDriver driver;
	@Given("^user need to be on hrm home  page$")
	public void user_need_to_be_on_hrm_home_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "D:\\selniumfiles\\chromeDriver92\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); 
	}

	@When("^user enter  username$")
	public void user_enter_username() throws Throwable {
		   driver.findElement(By.id("txtUsername")).sendKeys("Admin");

	}

	@Then("^verify text present in username feild$")
	public void verify_text_present_in_username_feild() throws Throwable {
		String uname=   driver.findElement(By.id("txtUsername")).getAttribute("value");
    Assert.assertEquals("Admin", uname);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}

	@Then("^verify text present in password feild$")
	public void verify_text_present_in_password_feild() throws Throwable {
		String pass=   driver.findElement(By.id("txtPassword")).getAttribute("value");
	    Assert.assertEquals("admin123", pass); 
	}

	

	@When("^click login button$")
	public void click_login_button() throws Throwable {
		 driver.findElement(By.id("btnLogin")).click();
	    
	}

	
}
