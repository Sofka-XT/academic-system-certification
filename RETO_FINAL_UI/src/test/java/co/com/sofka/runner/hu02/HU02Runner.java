package co.com.sofka.runner.hu02;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty","html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/hu02"},
        glue = {"co.com.sofka.stepdefinition.hu02"},
        tags = "not @ignore"
)
public class HU02Runner {
}
