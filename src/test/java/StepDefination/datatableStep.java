package StepDefination;

import java.util.List;
import java.util.Map;

import BaseLayer.BaseClass;
import PageLayer.registrationpage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatableStep extends BaseClass {

	@When("user enter data")
	public void user_enter_data(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
	//List<List<String>> cells = dataTable.cells();
	//List<String> asList = dataTable.asList();
	
	List<List<String>> list = dataTable.asLists();
	//List<Map<String, String>> asMaps = dataTable.asMaps();
	
		
		for (List<String> abc : list) {
			
		
		 
		registrationpage p=new registrationpage();
	
	     p.nameenter(abc.get(0), abc.get(1));
		}
	    
	}
@Then("user is home page")
public void user_is_home_page() {
    System.out.println(driver.getCurrentUrl());
}




}
