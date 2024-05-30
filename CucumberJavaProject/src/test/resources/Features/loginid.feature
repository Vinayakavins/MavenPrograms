Feature: login
To access the site
As a user
I need to be able to log in

Scenario: Successful Login
  Given I am on the login page
  When I fill in "username" with "test"
  And I fill in "password" with "test"
  And I click on the "Login" button
  Then I should see the "Welcome" page

Scenario: Failed Login
  Given I am on the login page
  When I fill in "username" with "test"
  And I fill in "password" with "wrong password"
  And I click on the "Login" button
  Then I should see the "Error" page