package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllfeatureFile/multipaluser.feature"},
		glue= {"StepDefination"},
		dryRun=false,
		monochrome=true
		
		)


public class fbreg {

}
