package com.api.pages;

import io.restassured.response.Response;

public class AuthService extends BaseService {
    private static final String BASE_PATH = "/auth";

    public Response login(String payload){
        return makePostRequest(payload, BASE_PATH);
    }
}
