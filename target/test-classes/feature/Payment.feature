Feature: Payment Functinality

@Reg1
Scenario: Payment with COD

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user enter "Simbal" "Pal" "208021"
And user click on Continue button
And user click on Finish button
Then validate order success message
