Feature: To validate the functionality of swapi API Playground
  As a Tester
  I want to verify following scenarios are working as expected

  Scenario Outline: Validate all the endpoints in API Playground should return 200 response
    Given I have endpoint for swapi api
    When I perform GET operation for "<endpoint>" number "<number>"
    Then I receive status "<status>"
    Examples:
      |  endpoint   |number |status|
      |  planets    |3      |  200 |
      |  people     |1      |  200 |


  Scenario Outline: Validate all the endpoints in API Playground should return 200 response
    Given I have endpoint for swapi api
    When I perform GET operation for "<endpoint>" number "<number>"
    Then I receive status "<status>"
    And I verify "<name>" , "<rotation_period>" , "<orbital_period>", and "<diameter>" values for the planets
    Examples:
      |  endpoint   |number |status|name       |rotation_period| orbital_period| diameter|
      |  planets    |3      |  200 | Yavin IV  |24             |           4818|   10200|
      |  planets    |4      |  200 | Hoth      |23             |           549|    7200  |