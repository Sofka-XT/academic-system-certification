package co.com.sofka.runner.hu03;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty","html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/hu03"},
        glue = {"co.com.sofka.stepdefinition.hu03"},
        tags = "not @ignore"
)
public class HU03Runner {
}
