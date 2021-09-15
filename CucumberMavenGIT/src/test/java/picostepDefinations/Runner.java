package picostepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources/cucumbergoogleFeatures"},
glue= {"picostepDefinations"},
plugin= {
		"pretty",
		"html:target/cucumberhtmlreports",
		"json:target/cucumberjasonreport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/extentreports.html"
}
		)
public class Runner {

}
