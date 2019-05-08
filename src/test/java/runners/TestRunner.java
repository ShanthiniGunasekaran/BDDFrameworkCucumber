package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue="stepdefs",plugin= {"pretty","html:target/cucumber-reports",
		"json:target/cucumber-reports/jsonReport.json",
		"junit:target/cucumber-reports/xmlReport.xml"}
)
public class TestRunner {
	
}
