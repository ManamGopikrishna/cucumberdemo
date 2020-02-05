Feature: Login
Scenario Outline: Login page successful
Given user should be on login page
When user enters "<username>" and "<password>" credentials and clicks submit
Then user login should be successful
Examples: 
|username|password|
|lalitha|Password123|

