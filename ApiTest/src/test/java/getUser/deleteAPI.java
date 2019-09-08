package getUser;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class deleteAPI {

   // @Test
    public void getUserDetails() {
        RestAssured.baseURI = "http://localhost:3000";

        // Request Instance
        RequestSpecification getrequest = RestAssured.given();


        //Response object
        Response response = getrequest.request(Method.DELETE, "/users/4");


        //print response in console window

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is:" + responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 200);


    }


}
