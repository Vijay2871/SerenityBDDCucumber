package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {"pretty", "json:target/site/serenity/cucumber/report.json"},
    features = "src/test/resources/features/",
    glue = "steps",
    tags = "@SignIn")
public class TestRunner {}
