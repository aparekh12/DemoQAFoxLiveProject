package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class ShoppingCartPage {
	
	
	
	//Constructor to initialize all webelements created
	
			public ShoppingCartPage() {
				
				//Constructor to initialize all webelements create
				PageFactory.initElements(Base.driver, this);
						
			}
		
	
			
			
	@FindBy(linkText="Checkout")
	public static WebElement btncheckout;
	
	
	
	public static void clickbtncheckout() {
		
		Waits.waitUntilElementLocated(10, btncheckout);
		Elements.click(btncheckout);
		
	}
	
	

}
