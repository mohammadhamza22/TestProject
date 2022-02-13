Feature: Login Featuresss

Scenario: Forgot Password link
Given user is on the Login Page
Then forgot your password link should be displayed

  
  
  
  
Scenario: Login into the salesforce
Given User is the already on the login page
When title of the login page is Please Log In
Then user enters the username "asit.srivastava@adeccogroup.com.foeurope.int" and password "Adecco@1234"
And user is on the Homepage
Then user then quits
