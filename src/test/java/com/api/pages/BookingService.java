package com.api.pages;

import io.restassured.response.Response;

public class BookingService extends BaseService {
    private static final String BASE_PATH = "/booking";

    public Response getAllBookingIds(){
        return makeGetRequest(BASE_PATH);
    }

    public Response getBookingId(String id){
        return makeGetRequest(BASE_PATH + "/" + id);
    }
}
