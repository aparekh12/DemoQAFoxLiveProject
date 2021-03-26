package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	
	
	
	//Constructor to initialize all webelements created
	
			public LoginPage() {
				
				//Constructor to initialize all webelements create
				PageFactory.initElements(Base.driver, this);
						
			}
	
	
	@FindBy(id="input-email")
	public static WebElement txtemail;
	
	
	@FindBy(id="input-password")
	public static WebElement txtpassword;
	
	
	@FindBy(css="input[value='Login']")
	public static WebElement btnlogin;
	
	@FindBy(css= "div[class$='alert-dismissible']")
	public static WebElement txtmainwarnmsg;
	
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement linkforgotpwd;
	

	public static void  doLogin(String email, String Password) {
		
		
		Elements.TypeText(LoginPage.txtemail, email);
		Elements.TypeText(LoginPage.txtpassword, Password);
		Elements.click(LoginPage.btnlogin);
		
		
	}
	
	
}
