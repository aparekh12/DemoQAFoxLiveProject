package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class SearchResultsPage {
	
	//Constructor to initialize all webelements created
	
		public SearchResultsPage() {
			
			//Constructor to initialize all webelements create
			PageFactory.initElements(Base.driver, this);
					
		}
	
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement samsungSybcMasterSearchResults;
	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement noproductresultsmsg;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement firstAddtoCartOption;
	
	
	
	public static void addFirstProductInTheSearchResultsCart() {
		
		// next to add to bag is add cart option in search result page so element to create add to cart
		Waits.waitUntilElementLocated(10, firstAddtoCartOption);
		 Elements.click(firstAddtoCartOption);
		
	}	
	

}
