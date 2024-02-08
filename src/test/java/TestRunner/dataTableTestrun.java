package TestRunner;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllfeatureFile/datatable.feature"},
		glue= {"StepDefination"},
		//dryRun=true,
		monochrome=true,
		plugin= {"html:Reports/datatable.html"}
		
		
		)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class dataTableTestrun {

}
