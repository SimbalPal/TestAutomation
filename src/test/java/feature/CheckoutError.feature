@Reg12
Feature: Checkout Error Functinality

@Reg3
Scenario Outline: In checkout,error message displayed when user give partial information data.

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user enter "<First name>" "<Last Name>" "<Postal code>"
And user click on Continue button
Then validate error messsage displayed "<Error>"


Examples:
 |First name|Last Name|Postal code|Error|
 ||||Error: First Name is required|
|Simbal|pal||Error: Postal Code is required|
|Simbal||208021|Error: Last Name is required|
||pal|208021|Error: First Name is required|


@Reg4
Scenario: on canceling checkoutpage user navigate back to cart page

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user click on Cancel button
Then validate cart page open 


@Reg5
Scenario: user login then logout

When user enter "standard_user" and "secret_sauce"
And click on Login Button
Then click on three line menu button
And click on logout button
Then validate user successfully logout
 
 
 
 
 
 @Reg6
Scenario: on removing product in cart page validate no product in cartcount

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And remove product in cart page
Then validate cart count is ""


 
 
 
