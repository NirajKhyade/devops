package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Feature/Amazon.feature",
        glue= "stepDefinitions",
        tags = {"@withLogin"},
        plugin = "html:target/HtmlReports")

public class TestRunner {
}
