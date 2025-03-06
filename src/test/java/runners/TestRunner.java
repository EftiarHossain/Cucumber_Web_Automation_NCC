
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features",  // Path to your feature files
        glue = {"stepdefinitions"},  // Path to your step definitions
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-report.json"}  // Generate reports
)
public class TestRunner {
}
