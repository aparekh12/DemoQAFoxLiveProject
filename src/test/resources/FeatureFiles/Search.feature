Feature: Search functionally scenario

@Search @One
Scenario: Verify weather User is able to search for the [rpducts
	Given I launch the application
	When I search for a product "Samsung SyncMaster 941BW"
	Then I should see the product in the search results
	
	@Search @Two
	Scenario: Verify weather the User is informed when the product being searched is not available
	Given I launch the application
	When I search for a product "Apple iPhone"
	Then I should  see the message informing "There is no product that matches the search criteria." 
	