package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import io.restassured.response.ValidatableResponse;
import restassured.RestAssuredBase;

import static io.restassured.RestAssured.given;


public class SimpleTestsSteps extends RestAssuredBase {

    ValidatableResponse apiResponse;


    @Given("^I perform GET operation for \"([^\"]*)\" number \"([^\"]*)\"$")
    public void i_perform_GET_operation_for_number(String arg1, String arg2) {
        try {
            String Endpoint = BASE_URI + "/" + arg1 + "/" + arg2 + "/";
            System.out.println("endpoint is" + Endpoint );
            apiResponse = given().when().get(Endpoint).then();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^I receive status \"([^\"]*)\"$")
    public void i_receive_status(String arg1){
        if (apiResponse.statusCode(200).equals(true))
            System.out.println("Test case is passed");
    }
}
