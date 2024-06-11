package com.TestRunner;


import com.StepDefinition.CreateEmployeeSteps;
import com.StepDefinition.LoginSteps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"Features/Login.feature","Features/Employee.feature"},
        glue = "com/StepDefinition",
        plugin = {"pretty", "html:test-output.html"},
        dryRun = false
//        tags ="@smoke"
)



public class LoginTestRunner {
}
