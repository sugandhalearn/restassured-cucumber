Feature: To validate the functionality of swapi API Playground
  As a Tester
  I want to verify following scenarios are working as expected

  Scenario Outline: Validate all the endpoints in API Playground should return 200 response
    Given I perform GET operation for "<endpoint>" number "<number>"
    And I receive status "<status>"
    Examples:
      |  endpoint   |number |status|
      |  planets    |3      |  200 |
      |  people     |1      |  200 |

