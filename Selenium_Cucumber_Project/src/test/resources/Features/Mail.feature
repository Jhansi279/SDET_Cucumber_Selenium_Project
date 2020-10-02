Feature: To validate whether mail is sent successfully

Scenario: Send mail to valid mail id
Given User has logged into the application 
When The user clicks on Compose option on homepage
And Enters the required details for emailid as "naveen1@naveen1.com", subject as "Hi For Testing",mail body as "Hello Mr Naveen. This is for Testing From Tester1"
And clicks on Send button
Then an acknowledgement message is displayed 
