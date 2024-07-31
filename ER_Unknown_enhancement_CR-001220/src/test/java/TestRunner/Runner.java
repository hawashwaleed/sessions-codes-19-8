package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/Features"},
        glue = {"StepDefinition"},
        plugin = {
                "pretty",
                "html:target/MyReport_cucumber.html",
                "json:target/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7jvm"
        },
        tags = "@smoke"
)

public class Runner extends AbstractTestNGCucumberTests {

}
