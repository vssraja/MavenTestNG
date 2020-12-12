
@login

Feature: Magento Login
This feature is going to validate the login scenario of magento application
1.Positive Login
2.Invalid Login

#1. convert scenario to scenario outline
#2. template the data parameters
#3. Examples with the templated titles and corresponding data



@negative
Scenario Outline: Invalid Login
Given I am able to navigate onto magento home page
And I am able to click on the user icon
When I update the username as "<email>"
And I update the password as "<password>"
And I click on the login button
Then I should see the error message as "Invalid login or password."



Examples:
|email|password|
|natarajan.ramanathan93@gmail.com|welcome|
|test@gmail.com|password|


@positive @smoke
Scenario: Successful Login

Given I am able to navigate onto magento home page
And I am able to click on the user icon
When I update the username as "natarajan.ramanathan93@gmail.com"
And I update the password as "Welcome@123"
And I click on the login button
Then I should see the Logout link


