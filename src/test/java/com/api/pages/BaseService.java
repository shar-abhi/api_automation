package com.api.pages;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

    private static final String BASE_URI = "https://restful-booker.herokuapp.com";
    protected RequestSpecification requestSpecification;

    public BaseService(){
        requestSpecification = given().baseUri(BASE_URI);
    }

    protected Response makePostRequest(String payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }

    protected Response makeGetRequest(String endpoint){
        return requestSpecification.get(endpoint);
    }
}
