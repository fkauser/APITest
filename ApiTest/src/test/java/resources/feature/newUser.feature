Feature: Create a basic API Test Framework
#1.	Create a user
#2.	Retrieve the newly created user
#3.	Update the user created in Step 1
#4.	Retrieve the updated user
#5.	Delete the user created in Step 1


  Scenario: Create a New User
    Given Activate a Server
    When New User details added
    And Send new user details to Server
    Then A New User is Created


  Scenario: Retrieve the newly created user Information

    Then Request Server for Details
    Then verify the record

  Scenario: Update the user created in Scenario 1
    Then Modify the Record

  Scenario: Retrieve the updated user
    Then verify the modified record

  Scenario: Delete the user created in Step 1
    Then Delete the user and verify
    Then Verify the user is deleted