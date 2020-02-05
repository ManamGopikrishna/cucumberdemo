Feature: Add to cart
Scenario: User moves to cart without adding any item in it
Given user has registered into testme app
When user search a particular product like headphones
And try to proceed to payment without adding any item to the cart
Then testme app does not display the cart icon

