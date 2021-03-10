Feature: Application Login
Scenario: Home page default login
Given User is on landing page
When User login to the application with username "deepak" and password "kumar"
Then Home page is displayed
And Cards are displayed
