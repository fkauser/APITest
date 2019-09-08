package getUser;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertTrue;

public class postAPI {

  //  @Test
    public static void addUser()
    {
        RestAssured.baseURI = "http://localhost:3000";

        // Request Instance
        RequestSpecification getrequest = RestAssured.given();

        // Send New user Data
       // HashMap<String,String> newUser = new HashMap<String,String>();

        JSONObject newUser = new JSONObject();
        newUser.put("first_name","Yasuko");
        newUser.put("last_name","Chan");
        newUser.put("email","YA@gmail.com");

        getrequest.contentType(ContentType.JSON);


        //getrequest.header("Content-Type","application/json");

        getrequest.body(newUser.toJSONString()); // attach above data to the request

        //Response object
        Response response=getrequest.request(Method.POST,"/users");


        //print response in console window

        String responseBody=response.getBody().asString();
        System.out.println("Response Body is:" +responseBody);

        //status code validation
        int statusCode=response.getStatusCode();
        System.out.println("Status code is: "+statusCode);
        Assert.assertEquals(statusCode, 201);




    }

}
