Feature: Move forward without adding product to cart

Scenario: Move forward without adding product to cart

Given user login in TestMe App
Then user search for headphones
Then try to procced to payment without adding product to cart
Then TestMe App dosent show cart icon 