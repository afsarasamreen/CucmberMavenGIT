Feature: Testing orangehrm application
Scenario Outline: Verify hrm login button
Given user need to be on hrm login page
When user enter "<username>" username
And  user enter "<password>" password
And click on login button
Then verify result page
And close browser
Examples:
|username||password|
|Admin||admin123|
|Vasavi||vasavi123|
|Admin||admin123|