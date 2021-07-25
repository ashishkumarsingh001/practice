Feature: Application Login

Scenario: Home Page default login

Given user is on netbanking landing page
When user login into application with "abc" and "123"
Then Home page is populated
And Cards are displayed are "true"
	
	
Scenario: Home Page default login

Given user is on netbanking landing page
When user login into application with "fgj" and "999"
Then Home page is populated
And Cards are displayed are "false"