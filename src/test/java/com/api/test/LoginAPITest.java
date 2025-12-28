package com.api.test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {

    @Test(description="Test to login")
    public void loginTest() {

        Response resp = given()
                .baseUri("https://restful-booker.herokuapp.com")
                .header("Content-Type", "application/json")
                .body("{\"username\" : \"admin\",\"password\" : \"password123\"}")
                .post("/auth");
        System.out.println(resp.asPrettyString());

        Assert.assertEquals(resp.statusCode(),200);
    }
}
