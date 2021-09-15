package cucumberOneToOneRelationShip;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun=true,
	features={"src/test/resources/CucumberOneToOneFeatures"},
	glue= {"cucumberOneToOneRelationShip"}
		)
public class CucumberOneToOneRunner {

}
