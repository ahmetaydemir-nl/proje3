package stepdefinitions;

import com.sun.tools.jxc.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.state;
import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Us024StepDef {

    Response response;

    List<Map<String,Object>> listOfstates;

    Map state = new HashMap<String,Object>();

    @Given("Use api end point {string}")
    public void useApiEndPoint(String endPoint) {
        response=given().auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().response()
        ;
        response.prettyPrint();
    }

    @When("User sends a POST request to REST API endpoint {string} as {string}")
    public void userSendsAPOSTRequestToRESTAPIEndpointAs(String endPoint, String newState) {
        state statePojo = new state(newState);


        Response responsePut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                body(statePojo).
                when().
                put(endPoint);

        String idNumber = responsePut.jsonPath().getString("id");
        //responsePut.prettyPrint();
        responsePut.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);

        responsePut.prettyPrint();

        System.out.println(newState+"-state id:"+idNumber);

    }



}
