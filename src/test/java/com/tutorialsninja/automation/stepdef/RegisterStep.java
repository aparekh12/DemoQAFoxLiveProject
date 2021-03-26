package com.tutorialsninja.automation.stepdef;



import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountRegisterPage;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegisterStep {
	
	
	//Below created objects of all pages
	
	HeadersSection headersSection = new HeadersSection();
	AccountRegisterPage accountregisteration = new AccountRegisterPage();
	AccountSuccessPage accountsuccess = new AccountSuccessPage();
	
	@Given("^I Launch the application$")
	public void i_Launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
		
	   
	}

	@And("^I navigate to Account Registeration Page$")
	public void i_navigate_to_Account_Registeration_Page() {
	   
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.registerLink);
		
		
	}

	@When("^I Provide all the below valid details$")
	public void i_Provide_all_the_below_valid_details(DataTable datatable) {
		
		//below classnamepage.methond-because method is static
	   
		AccountRegisterPage.enterAllDetails(datatable,"unique");
		
	}

	@And("^I Select the Privacy Policy$")
	public void i_Select_the_Privacy_Policy() {
	   
		Elements.click(AccountRegisterPage.privacypolicy);
	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button() {
	   
		Elements.click(AccountRegisterPage.btncontinue);
		
		
	}
	
	
	@Then("^I should see user account has been successfully created$")
	public void i_should_see_user_account_has_been_successfully_created() {
		
	Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadcrum));
		
	//Elements.isDisplayed(AccountSuccessPage.successBreadcrum);	
				
	 
	}
	
	//Scenario:2

	@Then("^I should see that the user account is not created$")
	public void i_should_see_that_the_user_account_is_not_created() {
	  
		Assert.assertTrue(Elements.isDisplayed(AccountRegisterPage.registerlinktxt));
		
	}

	
	//Scenario:2
	
	@And("^I should see the error messages informing user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_user_to_fill_the_mandatory_fields() {
	   
		Assert.assertTrue(Elements.isDisplayed(AccountRegisterPage.txtfirstnamewarn));
		Assert.assertTrue(Elements.isDisplayed(AccountRegisterPage.txtlasstnamewarn));
		Assert.assertTrue(Elements.isDisplayed(AccountRegisterPage.txtemailwarn));
		Assert.assertTrue(Elements.isDisplayed(AccountRegisterPage.txttelephonewarn));
		Assert.assertTrue(Elements.isDisplayed(AccountRegisterPage.txtpasswordwarn));
		Assert.assertTrue(Elements.isDisplayed(AccountRegisterPage.txtmaindwarn));
		
	}
	
	
	//Scenario:3
	
	
	@And("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() {
		
		
		Elements.click(AccountRegisterPage.radiobtnSubscribe);
	    
	}

	//Scenario:4
	@When("^I Provide all the below duplicate details$")
	public void i_Provide_all_the_below_duplicate_details(DataTable datatable) {
		
		AccountRegisterPage.enterAllDetails(datatable,"duplicate");
	   
	}

	@Then("^I should see user is restricted from creating duplicate account$")
	public void i_should_see_user_is_restricted_from_creating_duplicate_account()  {
	   
		Assert.assertTrue(Elements.VerifyTextEquals(AccountRegisterPage.txtmaindwarn, "Warning: E-Mail Address is already registered!"));
		
		
	}
}
