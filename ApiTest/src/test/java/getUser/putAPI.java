package getUser;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class putAPI {


   // @Test
    public void putUserDetails() {
        RestAssured.baseURI = "http://localhost:3000";

        // Request Instance
        RequestSpecification getrequest = RestAssured.given();

        // Send New user Data
        JSONObject newUser = new JSONObject();


        newUser.put("first_name", "Kenshin");
        newUser.put("last_name", "Konishi");
        newUser.put("email", "Ken@gmail.com");

        getrequest.contentType(ContentType.JSON);
     //   getrequest.header("Content-Type", "application/json");

        getrequest.body(newUser.toJSONString()); // attach above data to the request

        //Response object
        Response response = getrequest.request(Method.PUT, "/users/4");


        //print response in console window

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is:" + responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 200);


    }

}