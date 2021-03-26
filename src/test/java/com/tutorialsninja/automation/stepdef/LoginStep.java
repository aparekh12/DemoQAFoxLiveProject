package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep {
	
	//Below created objects of all pages
	
	HeadersSection headersSection = new HeadersSection();
	LoginPage login = new LoginPage();
	MyAccountPage myaccountpage = new MyAccountPage();
	ForgotPasswordPage forgotpwd = new ForgotPasswordPage();
	
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@And("^I navigate to Account Login Page$")
	public void i_navigate_to_Account_Login_Page() {
		
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.loginLink);
		
	}

	@When("^I login to the Application using UserName \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_Application_using_UserName_and_Password(String username, String password) {
		
        LoginPage.doLogin(username,password);
		
	    
	}

	@Then("^I should see that user is able to login successfully$")
	public void i_should_see_that_user_is_able_to_login_successfully() {
		
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffiliateAccount));
	  
	}
	
	//Scenario two
	
	
	@Then("^I should see the error message that the credentials are invalid$")
	public void i_should_see_the_error_message_that_the_credentials_are_invalid() {
	    
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.txtmainwarnmsg, "Warning: No match for E-Mail Address and/or Password."));
	   
	}
	
	//Scenario Four
	
	
	@When("^I reset the forgotten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for_email(String email) {
		
		Elements.click(LoginPage.linkforgotpwd);
		Elements.TypeText(ForgotPasswordPage.emailField, email);
		Elements.click(ForgotPasswordPage.btncontinue); 
		
	}

	@Then("^I should see a message informing the user that information to resettings password have been sent to email address$")
	public void i_should_see_a_message_informing_the_user_that_information_to_resettings_password_have_been_sent_to_email_address() {
	    
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.txtmainwarnmsg,"An email with a confirmation link has been sent your email address."));
		
		
	 
	}


}
