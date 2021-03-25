Feature: Registration Functionality Scenarios

@Register @One
Scenario: Verify weather user is able to register into the application by providing all details
Given I Launch the application
And I navigate to Account Registeration Page
When I Provide all the below valid details
|FirstName|Ravi                |
|LastName |kiran               |
|Email    |Ravi.kiran@gmail.com|
|Telephone|9121634812          |
|Password |rkiran              |

And I Select the Privacy Policy
And I click on Continue Button
Then I should see user account has been successfully created 


 