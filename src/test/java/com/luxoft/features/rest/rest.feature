Feature: Rest Feature

  Scenario: Verify GET method status
    Given create request to "https://jsonplaceholder.typicode.com"
    When I send request to "posts" with parameter "3"
    Then StatusCode is 200

  Scenario: verify response text
    Given create request to "https://jsonplaceholder.typicode.com"
    When I send request to "posts" with parameter "3"
    Then response contains "qui ipsa sit aut"
#          // Для работы с JSON (создать CLASS по json https://www.jsonschema2pojo.org/

  Scenario: verify response value
    Given create request to "https://jsonplaceholder.typicode.com"
    When I send request to "posts" with parameter "3"
    Then response contains data
      | userid | 1                                                           |
      | id     | 3                                                           |
      | title  | ea molestias quasi exercitationem repellat qui ipsa sit aut |
