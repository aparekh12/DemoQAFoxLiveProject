package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

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
	
	

}
