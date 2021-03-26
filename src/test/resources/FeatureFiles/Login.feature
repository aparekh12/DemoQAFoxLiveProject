Feature: Login functionality schnarios

@Login @One
Scenario: Verify weather the user is able to login with valid credential
Given I launch the application
And I navigate to Account Login Page
When I login to the Application using UserName "ravi.kiran1@gmail.com" and Password "rkiran"
Then I should see that user is able to login successfully


@Login @Two
Scenario: Verifyweather the user is not able to login with invlid credentials
Given I launch the application
And I navigate to Account Login Page
When I login to the Application using UserName "ravi.kiran99@gmail.com" and Password "rkiran"
Then I should see the error message that the credentials are invalid 

@Login @Three
Scenario: Verify weather user is nnot able to login without providing credentials
Given I launch the application
And I navigate to Account Login Page
When I login to the Application using UserName "" and Password ""
Then I should see the error message that the credentials are invalid 

@Login @Four
Scenario: Verify user is able to reset the forgotten password
Given I launch the application
And I navigate to Account Login Page
When I reset the forgotten password for email "ravi.kiran@gmail.com"
Then I should see a message informing the user that information to resettings password have been sent to email address

