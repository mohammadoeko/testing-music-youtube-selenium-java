package com.testing.youtube.selenium.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/features/01.SignIn.feature",
                "src/main/resources/features/02.SearchData.feature",
        },
        glue = "com.testing.youtube.selenium.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
