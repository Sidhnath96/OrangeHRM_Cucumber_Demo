package com.TestRunner;


import com.StepDefinition.CreateEmployeeSteps;
import com.StepDefinition.LoginSteps;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(

        {
                LoginSteps.class,
                CreateEmployeeSteps.class
        }
)


public class MyTestRunnerSuit {
}
