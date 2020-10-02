package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/test/resources/Features/Register.feature"},
glue = {"stepDefinitions"},
dryRun = false,
monochrome = true,
plugin = {"pretty","html:reports/testoutput.html", "json:reports/cucumber.json","junit:reports/cucumber.xml"
}
)
public class Test_Runner {

}
