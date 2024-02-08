package fbStepDefination;

import java.io.IOException;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbSteps extends BaseClass {
	
	
	@Before
	public void setup() throws IOException {
		BaseClass.initaliation();
	}
	
	@Given("user is on login page come")
	public void user_is_on_login_page_come() {
	   System.out.println(driver.getCurrentUrl());
	}
	@When("user enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String user, String pass) {
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);  
	}
	@Then("user is on Homepage opration")
	public void user_is_on_homepage_opration() throws InterruptedException {
	   Thread.sleep(4000);
	   System.out.println(driver.getTitle());
	}


	

}
