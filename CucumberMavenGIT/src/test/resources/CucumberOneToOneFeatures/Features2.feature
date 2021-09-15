Feature: testing orangehrm
Scenario: verify passwords
Given User need to be on homepage
When user enters usernames
And user enters passwords
Then verify text presents in password 