package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStep {
	
	
	@Given("^I Launch the application$")
	public void i_Launch_the_application() throws Throwable {
		
		Base.driver.get(Base.reader.getUrl());
		
	   
	}

	@And("^I navigate to Account Registeration Page$")
	public void i_navigate_to_Account_Registeration_Page() {
	   
		
		
	}

	@When("^I Provide all the below valid details$")
	public void i_Provide_all_the_below_valid_details(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
	}

	@And("^I Select the Privacy Policy$")
	public void i_Select_the_Privacy_Policy() {
	   
		
	}

	@And("^I click on Continue Button$")
	public void i_clickk_on_Continue_Button() {
	   
	}

	@Then("^I should see user account has been successfully created$")
	public void i_should_see_user_account_has_been_successfully_created() {
	 
	}



}
