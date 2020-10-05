Feature: To validate user registration

Scenario Outline: To register with valid details
Given The user is on the application home page.
When The user clicks on Sign Up option
And user enters details for "<First Name>", "<Last Name>", "<email>", "<Username>", "<Password>", "<Confirm password>"
And clicks on Register button
Then user is logged into the application and sees a confirmation message on the screen.

Examples:
|First Name |Last Name |email 											|Username	|Password	  |Confirm password|
|Tester1606		|SDET		 	|madhusystemengineer@gmail.com|Tester1606	|Tester@1926|Tester@1926|
