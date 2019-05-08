Feature: login Functionality

Scenario: Login with valid credentials
Given Admin is on login page
When Admin enters valid email
And Admin enters valid password
Then Login is successful
