package getUser;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class getAPI {


   public void getUserDetails(){
    // setup URI
    RestAssured.baseURI = "http://localhost:3000";

    // Request Instance
    RequestSpecification getrequest = RestAssured.given();

    //Get a server response
    Response getResponse = getrequest.request(Method.GET, "/users/4");

    String str = getResponse.getBody().asString();
    System.out.println("Response for the GET: " + str);


    // Status
 int status = getResponse.getStatusCode();
 System.out.println("Status Code is : " + status);

 Assert.assertEquals(status , 200);
 Assert.assertEquals("Kauser" , "Kauser");
 assertTrue(str.contains("Steve"));
}

}
