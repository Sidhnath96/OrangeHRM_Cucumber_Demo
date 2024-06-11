package com.TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"Features/Employee.feature"},
        glue = "com/StepDefinition",
        plugin = {"pretty", "html:test-output.html"},
        dryRun = false,
        tags ="@implemented"
)

public class CreateEmployeeTestRunner {

}
