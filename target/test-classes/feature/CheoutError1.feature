@Reg11
Feature: Checkout Error1 Functinality


Scenario: In checkout,error message displayed when user give no information data.

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user enter "" "" ""
And user click on Continue button
Then validate error messsage displayed




Scenario: In checkout,error message displayed when user give partial information data.

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user enter "Simbal" "pal" ""
And user click on Continue button
Then validate error messsage displayed "Error: Postal Code is required"




Scenario: In checkout,error message displayed when user give partial information data.

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user enter "Simbal" "pal" ""
And user click on Continue button
Then validate error messsage displayed " Error: Last Name is required"



Scenario: In checkout,error message displayed when user give partial information data.

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user enter "Simbal" "pal" ""
And user click on Continue button
Then validate error messsage displayed "Error: First Name is required"




Scenario: on canceling checkoutpage user navigate back to cart page

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user click on Cancel button
Then validate cart page open 



Scenario: user login then logout

When user enter "standard_user" and "secret_sauce"
And click on Login Button
Then click on three line menu button
And click on logout button
Then validate user successfully logout
 
 
 
 
 
Scenario: on removing product in cart page validate no product in cartcount

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And remove product in cart page
Then validate cart count is ""



