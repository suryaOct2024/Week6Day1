Feature: Create an Account in Sales Force Application

Scenario: Create Account with valid data

Given 	Click on toggle menu button from the left corner
And  	Click view All 
And  	Click Sales from App Launcher
And  	Click on Accounts tab
When 	Click on New button
Then 	Enter the account name as 'TestUser'
And  	Select Ownership as 'Public'
And 	Click save 
And 	Verify Account name as 'TestUser'
And 	Close the browser