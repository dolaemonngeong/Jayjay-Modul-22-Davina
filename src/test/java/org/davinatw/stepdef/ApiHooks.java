package org.davinatw.stepdef;

import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class ApiHooks {

    @Before("@api")
    public void setupApi() {
        RestAssured.baseURI = "https://themealdb.com/api/json/v1/1";
    }
}
