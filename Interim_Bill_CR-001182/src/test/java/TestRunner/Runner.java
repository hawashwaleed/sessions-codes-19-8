package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {
    @CucumberOptions(
            features = {"src/main/resources/Features"},
            glue = {"StepDefinition"},
            plugin = {
                    "pretty",
                    "html:target/MyReport_cucumber.html",
                    "json:target/cucumber.json"
            },
            tags = "@smoke"
    )

    public class runner extends AbstractTestNGCucumberTests {

    }
}
