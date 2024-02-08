package StepDefination;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class refPage extends BaseClass {
	@Given("user is on regi page")
	public void user_is_on_regi_page() throws IOException {
	    BaseClass.initaliation();
	}
	@When("user enter {string}, {string}, {string} and {string}")
	public void user_enter_and(String string, String string2, String string3, String string4) throws InterruptedException {
		registrationpage rp=new registrationpage();
		rp.regi(string, string2, string3, string4);
		Thread.sleep(5000);
		
	}

	@Then("create new user")
	public void create_new_user() {
	    System.out.println("user 1");
	}

	@Then("print <{string}>")
	public void print(String string) {
	   System.out.println(string);
	}




}
