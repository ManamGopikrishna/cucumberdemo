Feature: Register
Scenario: User registration in testme
Given User is on the signup page
When User enters "<username>" and "<firstname>" and "<lastname>" and "<password>" and "<confirm password>" and "<gender>" and "<email>" and "<mobile number>" and "<dob>" and "<address>" and <"security question>" and "<answer>" click on submit button
Then User  successfully registered