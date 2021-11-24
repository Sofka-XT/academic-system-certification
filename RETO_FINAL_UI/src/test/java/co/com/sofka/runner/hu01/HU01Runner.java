package co.com.sofka.runner.hu01;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/hu01"},
        glue = {"co.com.sofka.stepdefinition.hu01"}
)
public class HU01Runner {
}
