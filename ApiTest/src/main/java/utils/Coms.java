package utils;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Coms {

    public static RequestSpecification getrequest = null;
    public static Response getResponse= null;
    public static String URI, FirstName, LastName, Email, UpdatedEmail, Path, ID ;


/*
        ***Sets properety values***
        This method must initialize first
    */

    public static void setup() {
        PropertyReader getpropertyValues = new PropertyReader();
        URI = getpropertyValues.getPropValues("URI");
        FirstName = getpropertyValues.getPropValues("FirstName");
        LastName = getpropertyValues.getPropValues("LastName");
        Email = getpropertyValues.getPropValues("Email");
        UpdatedEmail = getpropertyValues.getPropValues("UpdatedEmail");
        Path = getpropertyValues.getPropValues("Path");
        ID = getpropertyValues.getPropValues("UserId");
        System.out.println("Loaded Properties ====>" + URI +" " +FirstName +" "+LastName+" "+Email+" " +Path + " "+ ID);


    }
}
