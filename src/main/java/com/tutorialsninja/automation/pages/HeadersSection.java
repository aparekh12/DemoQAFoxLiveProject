package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	
	
	//Constructor to initialize all webelements created
	
	public HeadersSection() {
		
		//Constructor to initialize all webelements create
		PageFactory.initElements(Base.driver, this);
				
	}
	
	
	@FindBy(xpath ="//span[text()='My Account']")
	public static WebElement myAccountLink;
	
	@FindBy(linkText="Register")
	public static WebElement registerLink;
	
	
	@FindBy(linkText="Login")
	public static WebElement loginLink;	
	
	@FindBy(name="search")
	public static WebElement txtsearchfield;	
	
	@FindBy(css="button.btn.btn-default.btn-lg")
	public static WebElement btnsearch;	
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement shoppingcart;
	
	
	


	
	
	//reusable methods
	
	public static void navigateToLoginPage() {
		
		Elements.click(myAccountLink);
		Elements.click(loginLink);
		
		
	}
	
	
	//Product search reusable method using reader- config.properties
	
	public static void searchProduct() {
		//search for product and date entry made on config.properties		
				Elements.TypeText(HeadersSection.txtsearchfield, Base.reader.getproduct());
				Elements.click(HeadersSection.btnsearch);
		
	}
	
	
	public static void clickonshoppingcartpage() {
		
		 //Click on shopping cart
	//	Elements.click(HeadersSection.shoppingcart);
		Elements.click(shoppingcart);
		
	}
	
	

}
