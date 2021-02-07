# restassured-cucumber
 
This is a test framework to implement automation frame work for open API https://swapi.dev/ to verify the name of planet and people exists in the Corresponding API response bodies as expected. Test Cases are written in BDD format in cucumber in Gherkin syntax to ensure the understandibility for business stakeholders for example Business Analysts, product managers.This framework uses:

1> REST-assured
2> Cucumber
3> github ci

Project structure is:
├── .idea
    ├── workflows  # Github ci workflow
├── test                    
│   ├── java    
│        ├── features # Cucumber Test files (alternatively `spec` or `tests`)
         ├── restassured #Basefile to be extended later
         ├── runners  #JUnit runner file with cucumber properties
         ├── steps #Restassured, Java step definition files. to be extended later
│   ├── Target
         ├── report 
└── ...
         
         
         
Example test scenario covered in this test frameworks are:

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
 Both tests cases are passing as seen below:
 
[![Screenshot-2021-02-07-at-22-11-10.png](https://i.postimg.cc/D0JvyxdM/Screenshot-2021-02-07-at-22-11-10.png)](https://postimg.cc/QKDGfkzQ)
[![Screenshot-2021-02-07-at-22-12-53.png](https://i.postimg.cc/5236rkPB/Screenshot-2021-02-07-at-22-12-53.png)](https://postimg.cc/JssrDKC0)
 
Above screenshot gives the visuals of the github ci/cd implementation, where test results are displayed in console in ci pipeline stage.

The Github ci pipeline also includes the Artifacts on the location https://github.com/sugandhalearn/restassured-cucumber/actions > latest run > Artifacts in the zip format, where you can access HTML report from zipped folder.

[![Screenshot-2021-02-07-at-22-15-47.png](https://i.postimg.cc/26Y95ydR/Screenshot-2021-02-07-at-22-15-47.png)](https://postimg.cc/WD9wW2fX)
