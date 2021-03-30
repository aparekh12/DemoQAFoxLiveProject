Feature: Endto End Orders placing scenarios

@Orders @One
Scenario: Verify weather the user is able to place orders
Given I login to the application
When I add a product to bag and checkout
And I place an order
Then I should see that the order is Successfully placed

