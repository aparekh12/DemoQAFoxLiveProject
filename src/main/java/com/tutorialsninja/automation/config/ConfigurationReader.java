package com.tutorialsninja.automation.config;

public interface ConfigurationReader {
	
	public String getUrl();
	public String getBrowser();
	public int getPageLoadTimeOut();
	
	//adding username and password because added in config.properties file
	public String getusername();
	public String getpassword();
	public String getproduct();
	

}
