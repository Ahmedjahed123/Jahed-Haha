Feature: Login to facebook
Scenario Outline: Log in to check facebook status

Given I am on facebook homepage
When I enter my "<email address>" and "<password>"
And I click on login
Then I see my facebook profile pop up 

Examples: 
| email address                 | password | 
| jahed.ahmed09@qmail.cuny.edu | Halalboy |
| Jahed...... |  hahahahah |