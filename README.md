# restassured-cucumber
 
This is a test framework to implement automation frame work for open API https://swapi.dev/ to verify the name of planet and people exists in the Corresponding API response bodies as expected. Test Cases are written in BDD format in cucumber in Gherkin syntax to ensure the understandibility for business stakeholders for example Business Analysts, product managers.This framework uses:

1> REST-assured
2> Cucumber
3> github ci


Example test scenario covered in this test frameworks are:

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
 
 Both tests cases are passing as seen below:
 
 [![Screenshot-2021-02-07-at-19-08-42.png](https://i.postimg.cc/T2qxYcQH/Screenshot-2021-02-07-at-19-08-42.png)](https://postimg.cc/rzm3fxBS)
 
 This screenshot gives the visuals of the github ci/cd implementation, where test results are displayed in console in ci pipeline stage.
