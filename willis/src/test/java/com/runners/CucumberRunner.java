package com.runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue ="com.stepDefinations",
        features = "src/test/resources/features")

public class CucumberRunner {

}
