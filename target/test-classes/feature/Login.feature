@Reg
Feature: Login Functinality

Scenario: Login with valid details

When user enter "standard_user" and "secret_sauce"
And click on Login Button
Then Validate Successfull login



Scenario: Login with invalid details

When user enter "problem_userx" and "secret_saucex"
And click on Login Button
Then Validate error message



Scenario: Login with right username and wrong password

When user enter "problem_user" and "secret_saucex"
And click on Login Button
Then Validate error message


Scenario: Login with wrong username and right password

When user enter "1234562acas" and "secret_sauce"
And click on Login Button
Then Validate error message



Scenario: Login with blank username and password

When user enter "" and ""
And click on Login Button
Then Validate error message



Scenario: Login with blank username and right password

When user enter "" and "secret_sauce"
And click on Login Button
Then Validate error message


Scenario: Login with right username and blank password

When user enter "problem_user" and ""
And click on Login Button
Then Validate error message


















