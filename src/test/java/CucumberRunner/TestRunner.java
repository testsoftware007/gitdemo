package CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/Login.feature",
		glue = "StepDefenation",
		junit = "--step-notifications"
		
		//strict=true
		
	
		)
        

public class TestRunner {
	
}
