package co.despegar.com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Feature/",
glue = "co.despegar.com.stepDefinitions",
snippets = SnippetType.CAMELCASE)
public class runner {
}
