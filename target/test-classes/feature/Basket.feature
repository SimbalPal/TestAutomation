Feature: Basket Functinality

@Reg
Scenario: Add a product in cart form PLP

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
