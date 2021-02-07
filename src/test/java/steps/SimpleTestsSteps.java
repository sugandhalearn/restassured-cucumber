package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.specification.Argument;
import restassured.RestAssuredBase;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;

public class SimpleTestsSteps extends RestAssuredBase {
//    @Given("I perform GET operation for {string}")
//    public void iPerformGETOperationFor(String arg0) throws Throwable {
//        given().contentType(ContentType.JSON);
//    }

//    @And("I perform GET for the planet {string}")
//    public void iPerformGETForThePlanet(String arg0) throws Throwable {
//        when().get(String.format(BASE_URI + "/planets/%s", arg0)).then().body("name", is("Yavin IV"));
//    }

//    @And("I perform GET for the people {string}")
//    public void iPerformGETForThePeople(String arg0) throws Throwable {
//        when().get(String.format(BASE_URI + "/people/%s", arg0)).then().body("name", is("Luke Skywalker"));
//    }


    @Given("^I perform GET operation for \"([^\"]*)\"$")
    public void i_perform_GET_operation_for(String arg1) throws Throwable {
        given().contentType(ContentType.JSON);
    }

    @Given("^I perform GET for the planet \"([^\"]*)\"$")
    public void i_perform_GET_for_the_planet(String arg1) throws Throwable {
        when().get(String.format(BASE_URI + "/planets/%s", arg1)).then().body("name", is("Yavin IV"));
    }

    @Given("^I perform GET for the people \"([^\"]*)\"$")
    public void i_perform_GET_for_the_people(String arg1) throws Throwable {
        when().get(String.format(BASE_URI + "/people/%s", arg1)).then().body("name", is("Luke Skywalker"));
    }
}
