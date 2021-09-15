Feature: test orangehrm
Scenario: verify username
Given User need to be on orangehrm1 homepage
When user enters usernames
Then verify text presents in username 