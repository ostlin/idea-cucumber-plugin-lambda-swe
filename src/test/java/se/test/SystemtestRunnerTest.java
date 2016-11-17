package se.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "~@ignorera", strict = true, monochrome = true,
    plugin = {
        "html:target/cucumber-reports/html",
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/TEST-cucumber.xml" },
    features = "classpath:features/",
    glue = { "classpath:se.test.stepdef" })
public class SystemtestRunnerTest {

}
