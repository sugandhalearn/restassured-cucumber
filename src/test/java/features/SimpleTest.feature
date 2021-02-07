Feature: Verify get operations using REST-assured.

  Scenario: Verify one planet of the swapi API.
    Given I perform GET operation for "/planet"
    And I perform GET for the planet "3"



  Scenario: Verify one planet of the swapi API.
    Given I perform GET operation for "/people"
    And I perform GET for the people "1"
