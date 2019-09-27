Feature: Login Action

Scenario Outline: successful login with valid credentials
Given user is open the application
When user click on sign in link
And user enters "<username>" and "<password>"
Then mesage displayed login successfully
 
 Examples:
 |username | password|
 |lalitha |Password123|
 |admin| Password456|