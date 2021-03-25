package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class AccountRegisterPage {
		
		//Constructor to initialize all webelements created
		
		public AccountRegisterPage() {
			
			//Constructor to initialize all webelements create
			PageFactory.initElements(Base.driver, this);
					
		}
	
	
	@FindBy(id="input-firstname")
	public static WebElement txtfirstName;
	
	
	@FindBy(id="input-lastname")
	public static WebElement txtlastName;
	
	@FindBy(id="input-email")
	public static WebElement txtemail;
	
	@FindBy(id="input-telephone")
	public static WebElement txttelephone;
	
	@FindBy(id="input-password")
	public static WebElement txtpassword;
	
	@FindBy(id="input-confirm")
	public static WebElement txtconfirmpassword;
	
	
	@FindBy(name="agree")
	public static WebElement privacypolicy;
	
	
	@FindBy(css="input[value='Continue']")
	public static WebElement btncontinue;
	
	@FindBy(linkText ="Register")
	public static WebElement registerlinktxt;
	
	
	@FindBy(css="input#input-firstname+div")
	public static WebElement txtfirstnamewarn;
	
	@FindBy(css="input#input-lastname+div")
	public static WebElement txtlasstnamewarn;
	
	@FindBy(css="input#input-email+div")
	public static WebElement txtemailwarn;
	
	@FindBy(css="input#input-telephone+div")
	public static WebElement txttelephonewarn;
	
	@FindBy(css="input#input-password+div")
	public static WebElement txtpasswordwarn;
	
	
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement txtmaindwarn;
	
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement radiobtnSubscribe;
	
	
	
	//creating this reusable method to pass on step defination method
	
	public static void enterAllDetails(DataTable datatable,String detailsType) {
		
        Map<String,String> map = datatable.asMap(String.class, String.class);
		
		Elements.TypeText(AccountRegisterPage.txtfirstName, map.get("FirstName"));
	    Elements.TypeText(AccountRegisterPage.txtlastName, map.get("LastName"));
	   
	    //Adding timestamp to email address so get each run different email
	    
	 //   Elements.TypeText(AccountRegisterPage.txtemail, System.currentTimeMillis() + map.get("Email"));
	 //   Elements.TypeText(AccountRegisterPage.txtemail, map.get("Email"));
	    Elements.TypeText(AccountRegisterPage.txttelephone, map.get("Telephone"));
	    Elements.TypeText(AccountRegisterPage.txtpassword, map.get("Password"));
	    Elements.TypeText(AccountRegisterPage.txtconfirmpassword, map.get("Password"));
	    
	    if(detailsType.equalsIgnoreCase("duplicate"))
	    	Elements.TypeText(AccountRegisterPage.txtemail, map.get("Email"));
	    else
	    	Elements.TypeText(AccountRegisterPage.txtemail, System.currentTimeMillis() + map.get("Email"));
		
	}
	
	
/*public static void enterDuplicateDetails(DataTable datatable) {
		
        Map<String,String> map = datatable.asMap(String.class, String.class);
		
		Elements.TypeText(AccountRegisterPage.txtfirstName, map.get("FirstName"));
	    Elements.TypeText(AccountRegisterPage.txtlastName, map.get("LastName"));
	    Elements.TypeText(AccountRegisterPage.txtemail, map.get("Email"));
	    Elements.TypeText(AccountRegisterPage.txttelephone, map.get("Telephone"));
	    Elements.TypeText(AccountRegisterPage.txtpassword, map.get("Password"));
	    Elements.TypeText(AccountRegisterPage.txtconfirmpassword, map.get("Password"));
		
	}*/
	
	
	
}
