Feature: login functionality in web application
Scenario Outline: Login functionality of the application
Given user launches the application
 When user enter the below data for login the application
|username|password|
|raji@gmail.com|9629|
And user click the login button
Then user verifies the product homepage


Scenario Outline: Login facebook  application
Given user launches the application
When user enter the valid"<username>"in username box
And user enter a valid "<password>" in password box
Then validate the homepage

Example :
|username|password|



