package com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/zerobank/stepdefinitions",
        dryRun = false,
        strict = false,
        tags = "@login",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)
public class CukesRunner {
}
