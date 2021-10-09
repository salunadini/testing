Feature: To test login functionality
  Scenario:
    Given User is on login page
    When user enters user name and password
    And click on login button
    Then User is navigated to the home page
