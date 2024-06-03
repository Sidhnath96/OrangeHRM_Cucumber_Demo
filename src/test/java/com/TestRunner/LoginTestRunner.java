package com.TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ={"Features/Login.feature"} ,
        glue = "com/StepDefinition",
        plugin ={"pretty", "html:test-output.html"},
        dryRun = false
)
public class LoginTestRunner {
}
