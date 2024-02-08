package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFile/fb.feature"},
		glue= {"fbStepDefination"},
		monochrome=true,
		dryRun=false
		)

public class testRunnerFb {

}
