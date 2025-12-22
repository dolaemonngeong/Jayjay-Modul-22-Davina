package org.davinatw.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.junit.Assert.assertEquals;

public class MealApiStepDef {

    Response response;

    @Given("prepare TheMealDB API")
    public void prepareTheMealDBApi() {
        RestAssured.baseURI = "https://themealdb.com/api/json/v1/1";
    }

    @When("user sends GET request to get categories")
    public void userSendsGetRequestToGetCategories() {
        response = RestAssured
                .given()
                .when()
                .get("/categories.php");
    }

    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @Then("response body should match json schema {string}")
    public void responseBodyShouldMatchJsonSchema(String schemaFileName) {

        File schema = new File(
                "src/test/resources/jsonSchema/" + schemaFileName
        );

        response.then().assertThat()
                .body(matchesJsonSchema(schema));
    }
}
