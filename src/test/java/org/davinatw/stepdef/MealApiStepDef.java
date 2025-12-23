package org.davinatw.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MealApiStepDef {

    Response response;

    @Given("user sends GET request to get categories")
    public void userSendsGetRequestToGetCategories() {
        response = RestAssured
                .given()
                .when()
                .get("/categories.php");
    }

    @Given("user sends GET request to get a meal named {string}")
    public void userSendsGetRequestToGetTheMeal(String mealName) {
        response = RestAssured
                .given()
                .when()
                .get("search.php?s="+mealName);
    }

    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @And("response body should match json schema {string}")
    public void responseBodyShouldMatchJsonSchema(String schemaFileName) {

        File schema = new File(
                "src/test/resources/jsonSchema/" + schemaFileName
        );

        response.then().assertThat()
                .body(matchesJsonSchema(schema));
    }

    @And("response body should contain empty meals list")
    public void responseBodyShouldContainEmptyMealsList() {
        assertNull(response.jsonPath().get("meals"));
    }

}
