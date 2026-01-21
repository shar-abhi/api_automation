package com.api.test;

import com.api.pages.BookingService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BookingAPITest {
    protected BookingService bookingPageObj;

    @BeforeClass
    public void setup(){
        this.bookingPageObj = new BookingService();
    }

    @Test(description = "Get a All booking IDs")
    public void getAllBookingIdTest(){
        Response response = bookingPageObj.getAllBookingIds();
//        System.out.println("Total number of entries fetched: " + response.jsonPath().getList("$").size());

        Assert.assertTrue(response.jsonPath().getList("$").size() > 100);
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(description = "Get a specific booking ID")
    public void getBookingIdTest(){
        Response response = bookingPageObj.getBookingId("1");
//        System.out.println(response.asPrettyString());

        Assert.assertNotNull(response.jsonPath());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
