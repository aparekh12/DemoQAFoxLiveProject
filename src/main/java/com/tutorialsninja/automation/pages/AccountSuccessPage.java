package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class AccountSuccessPage {
	
	
	
	//Constructor to initialize all webelements created
	
			public AccountSuccessPage() {
				
				//Constructor to initialize all webelements create
				PageFactory.initElements(Base.driver, this);
						
			}
	
	@FindBy(linkText="Success")
	public static WebElement successBreadcrum;
	
	

}
