package runner;


import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = {"src/test/java/resources/feature"},
        glue = {"stepDefinations"},
        monochrome = true,
        tags = {},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
        //  format = {"json:target/cucumber.json", "html:target/report/html/cucumber-pretty"}
        // plugin = "html:target/selenium-reports"


)


public class TestRunner{



}
