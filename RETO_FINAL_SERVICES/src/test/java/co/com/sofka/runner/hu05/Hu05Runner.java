package co.com.sofka.runner.hu05;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty","html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/hu05"},
        glue = {"co.com.sofka.stepdefinition/hu05"},
        tags = "not @ignore"
)
public class Hu05Runner {
}
