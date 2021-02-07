package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:Test_reports/cucumber-reports" },
        monochrome = true,
        dryRun = false,
        publish = true



)
public class TestRunner {
}
