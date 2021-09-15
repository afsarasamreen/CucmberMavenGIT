package cucumbertagsStepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags= {"@Smoke"},
		//tags={"@Sanity","@Reggression"},//AND
		tags={"@Sanity,@Reggression"},
		features= {"src/test/resources/CucumberTagsFeatures"},
		glue={"cucumbertagsStepDefinations"}
		
		)
public class CucumberTagsRunner {

}
