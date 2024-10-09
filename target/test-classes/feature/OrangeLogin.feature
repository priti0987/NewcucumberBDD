Feature: To test login functionality of ORANGE Website 

Scenario: To test a successful login

Given User navigates to login page
When User enters "Admin" as username
And User enters "admin@123" as password
And User clicks the Login Button
Then User should be taken into a Dashboard page