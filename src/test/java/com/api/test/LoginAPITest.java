package com.api.test;

import io.restassured.response.Response;
import com.api.pages.AuthService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {

    @Test(description="Test to login")
    public void loginTest() {

        String payload = "{\"username\" : \"admin\", \"password\" : \"password123\"}";
        AuthService authServiceObj = new AuthService();
        Response resp = authServiceObj.login(payload);

        Assert.assertEquals(resp.statusCode(),200);
    }
}
