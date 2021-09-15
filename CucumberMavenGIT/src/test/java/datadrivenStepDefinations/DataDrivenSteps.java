package datadrivenStepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenSteps {
	WebDriver driver;
	@Given("^user need to be on hrm login page$")
	public void user_need_to_be_on_hrm_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "D:\\selniumfiles\\chromeDriver92\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^user enter \"([^\"]*)\" username$")
	public void user_enter_username(String username) throws Throwable {
	   driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@When("^user enter \"([^\"]*)\" password$")
	public void user_enter_password(String password) throws Throwable {
		   driver.findElement(By.id("txtPassword")).sendKeys(password);
  
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^verify result page$")
	public void verify_result_page() throws Throwable {
	   String actualURL=driver.getCurrentUrl();
	   boolean status=actualURL.contains("dashboard");
	   Assert.assertEquals(true,status );
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    driver.close();
	}
}
