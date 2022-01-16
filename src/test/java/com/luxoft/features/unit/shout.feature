@shout
Feature: Shout feature
  Description can have a link to JIRA or Confluence
  The description can lay on
  a few lines

  Background: BackGround befor every step
    Given Show how background works

  Scenario: Listener should be within range
  scenario description can be in some lines
    Given Lucy is in 14 m from Sean
    When Sean shout "free bagels!"
    Then Lucy hears Sean's message

  Scenario: Listener is out of range
    Given Lucy is in 20 m from Sean
    When Sean shout "free bagels!"
    Then Lucy not hears Sean's message

@tag1
  Scenario: Listener is out of range 2
    * Lucy is in 20 m from Sean
    * Lucy is hungry
    * Sean shout "free bagels!"
    * Lucy hears Sean's message
    And Lucy goes to cafe
@tag2 @tag3
  Scenario Outline: Example of Outline
    Given Lucy is in <dist> m from Sean
    When Sean shout "<message>"
    Then Lucy hears Sean's message
    Examples:
      | dist | message           |
      | 12   | free bagels!      |
      | 13   | Бесплатные ролики |
      | 14  | Тра-ля-ля         |
