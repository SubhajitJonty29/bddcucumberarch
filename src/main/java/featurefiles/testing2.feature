Feature: Testfeature2

@SmokeTest @Regression
Scenario Outline: login test for
Given I enter URL "<URL>"
When I am on home page
Then I get home tiltle
Then I click on My account
Then I enter emailadderss "<EMAILADDRESS>"
Then I enter password "<PASSWORD>"
Then I click on Login

Examples:
|URL												|EMAILADDRESS			|PASSWORD|
|https://cape300.tcsapps.com/#/login?returnUrl=%2F	|subhajitopaul@gmail.com|Jonty	 |