package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

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
	
	
		
	
	

}
