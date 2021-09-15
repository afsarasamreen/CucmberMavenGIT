package picostepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {

	
	WebDriver driver;
	@Before
	public  WebDriver setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selniumfiles\\chromeDriver92\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    return driver;
	}
	
	@After
	public void teardown()
	{
		driver.close();
	}
}
