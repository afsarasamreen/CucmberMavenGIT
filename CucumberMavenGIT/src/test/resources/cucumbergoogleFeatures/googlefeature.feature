Feature: Test google app

Background: 
Given user need to be on google home page
Scenario: verify google search box
When user enter product name 
Then check text present in google search box



Scenario: verify google search functionality
When user enter product name 
And hit enter
