Feature: Sign up for an account
Scenario: Successful signup
Given I am on the signup page
When I fill out the form with my information
Then I should see a confirmation message