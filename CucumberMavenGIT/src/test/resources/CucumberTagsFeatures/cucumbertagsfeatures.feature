@Smoke
Feature: Testing orangehrm application

@Sanity
Scenario: Verify hrm username feild
Given user need to be on hrm home  page
When user enter  username
Then verify text present in username feild
And close the browser

@Sanity @Reggression
Scenario: Verify hrm password feild
Given user need to be on hrm home  page
When user enter  username
And user enter password
Then verify text present in password feild
And close the browser

@Reggression
Scenario: Verify hrm login button
Given user need to be on hrm home  page
When user enter  username
And user enter password
And click login button
And close the browser