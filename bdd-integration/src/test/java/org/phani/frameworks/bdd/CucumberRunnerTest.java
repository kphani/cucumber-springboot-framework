package org.phani.frameworks.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:cucumber-reports/CucumberRunnerTest.json",
                "junit:build/junit-test-report.xml",
                "html:cucumber-reports/CucumberRunnerTest.html"
        },
        glue = {
                "org.phani.frameworks.bdd.steps", "org.phani.frameworks.bdd.config"
        },
        features = {"classpath:features"},
        tags = "not @ignore"
)
public class CucumberRunnerTest {


}
