package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

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
	
	@FindBy(linkText="Edit your account information")
	public static WebElement acctloginmsg;
	
	@FindBy(xpath="//h2[contains(text(),'Returning Customer')]")
	public static WebElement txtheader;
	

	public static void  doLogin(String email, String Password) {
		
		
		Elements.TypeText(LoginPage.txtemail, email);
		Elements.TypeText(LoginPage.txtpassword, Password);
		Waits.waitUntilElementToClick(10, btnlogin);
		Elements.click(LoginPage.btnlogin);
		
		
	}
	
	//creating new login method [overriding] where all username and password data come from framework
	
	public static void doLogin() {
		
		
		  if(Elements.isDisplayed(txtheader)) {
		  /*    //reading this data username and password from the reader and configproperties
				Elements.TypeText(LoginPage.txtemail, Base.reader.getusername());
				Elements.TypeText(LoginPage.txtpassword, Base.reader.getpassword());
				Elements.click(LoginPage.btnlogin);*/
		
		
		//reading this data username and password from the reader and configproperties
		//we are in LoginPage class so remove that line
			    Elements.click(txtemail);
				Elements.TypeText(txtemail, Base.reader.getusername());
				Elements.TypeText(txtpassword, Base.reader.getpassword());
				Elements.isDisplayed(btnlogin);
				Elements.click(LoginPage.btnlogin);
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Elements.isDisplayed(acctloginmsg);  
		  }
		  
	}
	
	
	
	
}
