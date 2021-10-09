@SmokeScenario
Feature: To test login functionality
  @SmokeTest
  Scenario:
    Given User is on login page
    When user enters user name and password
    And click on login button
    Then User is navigated to the home page
    Scenario Outline:
      Given User is on login page
      When user enters <username> and <password>
      And click on login button
      Then User is navigated to the home page
      Examples:
      |username|password|
      |user1   |pass1   |
      |user2   |pass2   |