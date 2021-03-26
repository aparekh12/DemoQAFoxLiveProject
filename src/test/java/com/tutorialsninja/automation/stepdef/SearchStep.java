package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchStep {
	
	//Page object created which is use in below method
	
	 HeadersSection headersection = new HeadersSection();
	 SearchResultsPage searchresultspage = new SearchResultsPage();
	 
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product) {
	    
	  Elements.TypeText(HeadersSection.txtsearchfield, product);
	  Elements.click(HeadersSection.btnsearch);
		
		
	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results()  {
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.samsungSybcMasterSearchResults));
		
		
	   
	}
	
	//Scenario 2
	
	@Then("^I should  see the message informing \"([^\"]*)\"$")
	public void i_should_see_the_message_informing(String message )  {
		
		
		Elements.VerifyTextEquals(SearchResultsPage.noproductresultsmsg, message);
	   
	}
	
	
	
	
	
	

}
