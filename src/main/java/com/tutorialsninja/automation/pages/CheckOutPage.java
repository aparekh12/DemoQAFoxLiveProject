package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class CheckOutPage {
	
	
	//Constructor to initialize all webelements created
	
		public CheckOutPage() {
			
			//Constructor to initialize all webelements create
			PageFactory.initElements(Base.driver, this);
					
		}
	
	
	
	@FindBy(id="button-payment-address")
	public static WebElement btncontinueBillingOpt;
	
	
	@FindBy(id="button-shipping-address")
	public static WebElement btncontinueDeliveryOpt;
	
	@FindBy(id="button-shipping-method")
	public static WebElement btncontinueDeliveryMethodOpt;
	
	@FindBy(id="button-payment-method")
	public static WebElement btncontinuepaymentOpt;
	
	@FindBy(css="input[name='agree']")
	public static WebElement chkboxtermagree;
	
	@FindBy(id="button-confirm")
	public static WebElement btnconfirmorder;
	
	
	@FindBy(id="button-account")
	public static WebElement btncontinueregisteracct;
	
	@FindBy(id="input-email")
	public static WebElement txtemail;
	
	
	@FindBy(id="input-password")
	public static WebElement txtpassword;
	
	
	@FindBy(css="input[value='Login']")
	public static WebElement btnlogin;
	
	@FindBy(xpath="//h2[contains(text(),'Returning Customer')]")
	public static WebElement txtheader;
	
	
	
	@FindBy(linkText ="Checkout Options")
	public static WebElement ChkOpt;
	
	@FindBy(css ="#button-account")
	public static WebElement regostercontunue;
	
	@FindBy(css="input-payment-firstname")
	public static WebElement firstname;
	
	@FindBy(css="input-payment-lastname")
	public static WebElement lastname;
	
	@FindBy(css="input-payment-email")
	public static WebElement email;
	
	@FindBy(css="input-payment-telephone")
	public static WebElement telephone;
	
	@FindBy(css="input-payment-password")
	public static WebElement password;
	
	@FindBy(css="input-payment-company")
	public static WebElement copmany;

	@FindBy(css="input-payment-address-1")
	public static WebElement address1;
	

	@FindBy(css="input-payment-city")
	public static WebElement city;
	
	@FindBy(css="input-payment-postcode")
	public static WebElement zip;
	
	@FindBy(css="input-payment-country")
	public static WebElement country;
	
	
	@FindBy(css="input-payment-zone")
	public static WebElement region;
	
	@FindBy(css="input[type='checkbox'][name='agree']")
	public static WebElement agreecheckbox;
	
	@FindBy(id="cart-total")
	public static WebElement cartitem;
	
	@FindBy(linkText = "Checkout")
	public static WebElement cartitemchkout;
	
	
	public static void register() {
		Elements.click(regostercontunue);
		Elements.TypeText(firstname, "ravi4");
		Elements.TypeText(lastname, "kiran");
		Elements.TypeText(email,"ravi4.kiran@gmail.com");
		
		
	}

	public static void ordercheckoutprocess() {
		Elements.click(CheckOutPage.cartitem);
		Elements.click(CheckOutPage.cartitemchkout);
      	Elements.click(CheckOutPage.btncontinueBillingOpt);
		Elements.click(CheckOutPage.btncontinueDeliveryOpt);
		Elements.click(CheckOutPage.btncontinueDeliveryMethodOpt);
		Elements.click(CheckOutPage.chkboxtermagree);
		Elements.click(CheckOutPage.btncontinuepaymentOpt);
		Elements.click(CheckOutPage.btnconfirmorder);
		
	}
	
	
	
}
