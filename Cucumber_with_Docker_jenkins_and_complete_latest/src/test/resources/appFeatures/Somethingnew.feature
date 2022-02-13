
Feature: Something new
Background:
 
 
Given User is on the login page
| username                                   | password     |
|asit.srivastava@adeccogroup.com.foeurope.int| Adecco@1234  |

 








Scenario: Homepage title
Given user is on Homepage
When user gets the title of the page
Then page title should be "Terms of use"

