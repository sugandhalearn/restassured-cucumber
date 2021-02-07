package steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import restassured.RestAssuredBase;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class SimpleTestsSteps extends RestAssuredBase {

    ValidatableResponse apiResponse;
    @Given("^I have endpoint for swapi api$")
    public void haveEndpoint(){
        System.out.println("Base url is " + BASE_URI );
    }

    @When("^I perform GET operation for \"([^\"]*)\" number \"([^\"]*)\"$")
    public void i_perform_GET_operation_for_number(String arg1, String arg2) {
        try {
            String Endpoint = BASE_URI + "/" + arg1 + "/" + arg2 + "/";
            System.out.println("endpoint is " + Endpoint );
            apiResponse = given().when().get(Endpoint).then();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I receive status \"([^\"]*)\"$")
    public void i_receive_status(String arg1){
        apiResponse.
                assertThat().
                statusCode(200);

    }
    @Then("^I verify \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\", and \"([^\"]*)\" values for the planets$")
    public void i_verify_and_values_for_the_planets(String arg1, String arg2, String arg3, String arg4) {
        apiResponse.
                assertThat().
                body("name",equalTo(arg1)).
                body("rotation_period",equalTo(arg2)).
                body("orbital_period",equalTo(arg3)).
                body("diameter",equalTo(arg4));

    }

}
