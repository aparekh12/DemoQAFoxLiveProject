package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OrdersStep {
	
	//Page objects created
	
	HeadersSection headersection = new HeadersSection();
	LoginPage loginpage = new LoginPage();
	SearchResultsPage searchresultpage = new SearchResultsPage();
	ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
	CheckOutPage checkoutpage = new CheckOutPage();
	OrderSuccessPage ordersuccesspage = new OrderSuccessPage();
	
	
	
	@Given("^I login to the application$")
	public void i_login_to_the_application()  {
		
	   //reusable method define in Browser java class
		Browser.openApplicationURL();
		//reusable method define in HeadersSection java class page	
		HeadersSection.navigateToLoginPage();
		
		LoginPage.doLogin();
		
		
	}

	@When("^I add a product to bag and checkout$")
	public void i_add_a_product_to_bag_and_checkout()  {
		
		//Search product first
		 HeadersSection.searchProduct();
		// next to add to bag is add cart option in search result page so element to create add to cart
	
		 SearchResultsPage.addFirstProductInTheSearchResultsCart();
		 //Click on shopping cart
		 
		HeadersSection.clickonshoppingcartpage();
		//Click on shopping cart page
	//	ShoppingCartPage.clickbtncheckout();
		
	   
	}

	@And("^I place an order$")
	public void i_place_an_order() {
		
		CheckOutPage.ordercheckoutprocess();
	    
	}

	@Then("^I should see that the order is Successfully placed$")
	public void i_should_see_that_the_order_is_Successfully_placed()  {
		
		
		Waits.waitUntilElementLocated(10, OrderSuccessPage.successtab);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.successtab));
		
		
	   
	}


	
	
	
	
	
	
	
	
	

}
