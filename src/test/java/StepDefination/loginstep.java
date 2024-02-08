package StepDefination;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep extends BaseClass {

	@Before
	public void setup() throws IOException
	{
		BaseClass.initaliation();
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  System.out.println(driver.getTitle()); 
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   Loginpage lp=new Loginpage();
	   lp.loginfuctionality();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
	   System.out.println(driver.getTitle());
	}
	
	@After
	public void teardown()
	{
		driver.close();
	}
}
