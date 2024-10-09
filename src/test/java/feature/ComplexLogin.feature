Feature: Login page functionality
Inorder to test login in functionality
As a Registered user 
Check user login conditions

Scenario: Positive Login Flow

Given user is on Application home page
And Login button is present on screen
When user clicks on Login button
Then user is show Login screen
When user enters "kkrrii" in username field
And user enters "kkrrii@33" in password field
And user clicks Login button
Then user is on home page
And Title of home page is "Free CRM HR unlimited"

Scenario Outline: Login Failure

Given User is on Application home page
When user clicks on signin button
Then user is show Login screen
When user enters "<UserName>" in username field
And user enters "<Password>" in password field
And user clicks Login button
Then user gets login failed error messages


Examples:
|UserName|Password|
|Admin|admin@123|
|User|useR@123|