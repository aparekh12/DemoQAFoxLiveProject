Feature: Registration Functionality Scenarios 

@Register @One 
Scenario: 
	Verify weather user is able to register into the application by providing all details 
	Given I Launch the application 
	And I navigate to Account Registeration Page 
	When I Provide all the below valid details 
		|FirstName|Ravikant                |
		|LastName |kirankant               |
		|Email    |Ravi.kiran9@gmail.com|
		|Telephone|9121634812          |
		|Password |rkiran              |
		
	And I Select the Privacy Policy 
	And I click on Continue Button 
	Then I should see user account has been successfully created 
	
@Register @Two 
Scenario: 
	Verify wether the user is not allowed to register on skipping the mandatory fields 
	Given I Launch the application 
	And I navigate to Account Registeration Page 
	When I click on Continue Button 
	Then I should see that the user account is not created 
	And I should see the error messages informing user to fill the mandatory fields 
	
@Register @Three 
Scenario: 
	Verify weather user is able to register into aplication by opting for Newsletter subscription 
	Given I Launch the application 
	And I navigate to Account Registeration Page 
	And I navigate to Account Registeration Page 
	When I Provide all the below valid details 
		|FirstName|Ravikant                |
		|LastName |kirankant               |
		|Email    |Ravi.kiran9@gmail.com|
		|Telephone|9121634812          |
		|Password |rkiran              |
		
	And I Select the Privacy Policy 
	And I subscribe to Newsletter 
	And I click on Continue Button 
	Then I should see user account has been successfully created 
	
@Register @Four 
Scenario:
Verify weather the user is restricted from creating a duplicate account 
	Given I Launch the application 
	And I navigate to Account Registeration Page 
	When I Provide all the below duplicate details 
		|FirstName|Ravi                |
		|LastName |kiran              |
		|Email    |Ravi.kiran@gmail.com|
		|Telephone|9121634812          |
		|Password |rkiran              |
		
	And I Select the Privacy Policy 
	And I click on Continue Button 
	Then I should see user is restricted from creating duplicate account
	
	 	
		
		
    