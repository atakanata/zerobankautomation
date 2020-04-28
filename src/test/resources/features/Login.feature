@login
Feature: Login

  Background: open login page
    Given user is on the login page

  Scenario: Only authorized users should be able to login to the application
    When user logs in as an authorized user
    Then user should be able to see Account Summary page