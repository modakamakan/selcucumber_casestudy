Feature: testmeapp registration process

Scenario: user enters username and password other details for registration

Given page is opened
When user clicks on signup button
And user enters "harrutuja"  
Then user enters firstname as "harrutuja" and lastname "umesg"
Then user enters password as "abcd123" and confirmed password as "abcd123"
Then user enter "//input[@value='Female']"
Then user enters mail as "as@gmail.com" and mobile as "9876543231"
Then user enters dob as "20/10/1768"

Then user enters security question by index value 0 and answers security qst as "man"
And message displayed signup successful

