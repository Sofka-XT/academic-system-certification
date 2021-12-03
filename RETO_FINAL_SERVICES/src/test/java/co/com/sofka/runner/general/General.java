package co.com.sofka.runner.general;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty","html:target/cucumber-report/cucumber.html"},
        features= {"src/test/resources/features"},
        glue = {"co.com.sofka.stepdefinition"},
        tags = "not @ignore"
)
public class General {
}
