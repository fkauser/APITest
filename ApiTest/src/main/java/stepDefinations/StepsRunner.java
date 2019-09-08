package stepDefinations;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import utils.Coms;
import utils.RestUtils;
import static org.junit.Assert.assertTrue;

public class StepsRunner {

    RestUtils restUtil = new RestUtils();
    Coms com = new Coms();
    public static String responseBody;
    public static String latestRecord;


    @Given("^Activate a Server$")
    public void activateAServer() {
        com.setup();
        restUtil.setBaseURI(com.URI);
        com.getrequest = RestAssured.given(); // Request Instance
    }


    @When("^New User details added$")
    public void newUserDeatilsAdded() {
        com.getrequest.body(restUtil.addNewUser(com.FirstName, com.LastName, com.Email).toJSONString());
        com.getrequest.contentType(ContentType.JSON);
    }

    @And("^Send new user details to Server$")
    public void sendNewUserDetailsToServer() {
        com.getResponse = com.getrequest.request(Method.POST, com.Path);
    }

    @Then("^A New User is Created$")
    public void aNewUserIsCreated() {

        restUtil.checkStatusIs201(com.getResponse);
        String responseBody = com.getResponse.getBody().asString();


        if (responseBody.contains(com.FirstName) == true) {
            System.out.println(" A NEW USER " + "\"" + com.FirstName + "\" is created.:");

        } //
        else {
            System.out.println(" FAILED TO CREATE A USER");
        }  //

    }


    @Then("^Request Server for Details$")
    public void requestServerForDetails() {

        String myArray = com.getResponse.jsonPath().getString("id");
         latestRecord = restUtil.getIdOfLastRecord(myArray);
        com.getResponse = com.getrequest.request(Method.GET, com.Path + latestRecord);
        responseBody = com.getResponse.getBody().asString();
        System.out.println("\n" + responseBody);

    }

    @Then("^verify the record$")
    public void verifyTheRecord() {
        assertTrue(responseBody.contains(com.FirstName));
        restUtil.checkStatusIs200(com.getResponse);
        System.out.println("***Validation Completed***");
    }

    @Then("^Modify the Record$")
    public void modifyTheRecord(){

        latestRecord = null;
        String myArray = com.getResponse.jsonPath().getString("id");
        latestRecord = restUtil.getIdOfLastRecord(myArray);


        com.getrequest.body(restUtil.addNewUser(com.FirstName, com.LastName, com.UpdatedEmail).toJSONString());
        com.getrequest.contentType(ContentType.JSON);

        // last record can be changed with userID from properties // com.ID
        com.getResponse = com.getrequest.request(Method.PUT, com.Path + latestRecord);
        responseBody = com.getResponse.getBody().asString();
        System.out.println("\n" + responseBody);
    }

    @Then("^verify the modified record$")
    public void verifyTheModifiedRecord()  {

        assertTrue(responseBody.contains(com.UpdatedEmail));
        restUtil.checkStatusIs200(com.getResponse);
        System.out.println("***Record Modified - Validation Completed***");
    }

    @Then("^Delete the user and verify$")
    public void deleteTheUserAndVerify() {
        latestRecord = null;
        String myArray = com.getResponse.jsonPath().getString("id");
        latestRecord = restUtil.getIdOfLastRecord(myArray);
        com.getResponse = com.getrequest.request(Method.DELETE, com.Path + latestRecord);
    }

    @Then("^Verify the user is deleted$")
    public void verifyTheUserIsDeleted()  {
        assertTrue(responseBody.contains(com.UpdatedEmail));
        restUtil.checkStatusIs200(com.getResponse);
        System.out.println("***Record Deleted - Validation Completed***");
    }
} // StepsRunner
