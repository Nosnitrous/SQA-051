@web
Feature: Web Feature Login and other

  Scenario: Login test
    Given I enter "tomsmith" to the "UserName" Field
    And I enter "SuperSecretPassword!" to the "Password" Field
    When I Click "login" button
    Then Button "logout" is displayed

  Scenario: Negative test
    Given I enter "tomsmit" to the "UserName" Field
    And I enter "SuperSecretPassword!" to the "Password" Field
    When I Click "login" button
    Then Button "logout" is displayed