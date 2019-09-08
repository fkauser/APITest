$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("newUser.feature");
formatter.feature({
  "line": 1,
  "name": "Create a basic API Test Framework",
  "description": "",
  "id": "create-a-basic-api-test-framework",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#1.\tCreate a user"
    },
    {
      "line": 3,
      "value": "#2.\tRetrieve the newly created user"
    },
    {
      "line": 4,
      "value": "#3.\tUpdate the user created in Step 1"
    },
    {
      "line": 5,
      "value": "#4.\tRetrieve the updated user"
    },
    {
      "line": 6,
      "value": "#5.\tDelete the user created in Step 1"
    }
  ],
  "line": 9,
  "name": "Create a New User",
  "description": "",
  "id": "create-a-basic-api-test-framework;create-a-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Activate a Server",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "New User details added",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Send new user details to Server",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "A New User is Created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsRunner.activateAServer()"
});
formatter.result({
  "duration": 356994400,
  "status": "passed"
});
formatter.match({
  "location": "StepsRunner.newUserDeatilsAdded()"
});
formatter.result({
  "duration": 44783200,
  "status": "passed"
});
formatter.match({
  "location": "StepsRunner.sendNewUserDetailsToServer()"
});
formatter.result({
  "duration": 662620300,
  "status": "passed"
});
formatter.match({
  "location": "StepsRunner.aNewUserIsCreated()"
});
formatter.result({
  "duration": 7667000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Retrieve the newly created user Information",
  "description": "",
  "id": "create-a-basic-api-test-framework;retrieve-the-newly-created-user-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Request Server for Details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify the record",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsRunner.requestServerForDetails()"
});
formatter.result({
  "duration": 238200700,
  "status": "passed"
});
formatter.match({
  "location": "StepsRunner.verifyTheRecord()"
});
formatter.result({
  "duration": 65200,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Update the user created in Scenario 1",
  "description": "",
  "id": "create-a-basic-api-test-framework;update-the-user-created-in-scenario-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "Modify the Record",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsRunner.modifyTheRecord()"
});
formatter.result({
  "duration": 21428300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Retrieve the updated user",
  "description": "",
  "id": "create-a-basic-api-test-framework;retrieve-the-updated-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "verify the modified record",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsRunner.verifyTheModifiedRecord()"
});
formatter.result({
  "duration": 100800,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Delete the user created in Step 1",
  "description": "",
  "id": "create-a-basic-api-test-framework;delete-the-user-created-in-step-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Delete the user and verify",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Verify the user is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsRunner.deleteTheUserAndVerify()"
});
formatter.result({
  "duration": 21784000,
  "status": "passed"
});
formatter.match({
  "location": "StepsRunner.verifyTheUserIsDeleted()"
});
formatter.result({
  "duration": 206500,
  "status": "passed"
});
});