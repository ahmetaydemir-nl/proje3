package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Customer;
import utilities.ConfigurationReader;
import utilities.WriteTxtUtil;

import static io.restassured.RestAssured.given;

public class Us023StepDef {

    Response response;
    String filePath = ConfigurationReader.getProperty("filePath_Customer");
    Customer[] customers;

    @Given("kullanici api end pointi {string} kullanarak tum yanitlari set eder")
    public void kullaniciApiEndPointiKullanarakTumYanitlariSetEder(String url) {
        response=
                given().auth().oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when().get(url).then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }

    @And("kulllanici country verilerini json olarak java pojo ya cevirir")
    public void kulllaniciCountryVerileriniJsonOlarakJavaPojoYaCevirir() throws Exception {

        ObjectMapper obj = new ObjectMapper();
        customers = obj.readValue(response.asString(), Customer[].class);

        for(int i=0; i<customers.length; i++){
            if(customers[i].getUser() !=null)
                System.out.println("id:"+customers[i].getId());
    }


    }

    @Then("kullanici verileri dogrular")
    public void kullaniciVerileriDogrular() {
        WriteTxtUtil.saveDataInFileWithAllCustomerInfo (filePath, customers);
    }
}
