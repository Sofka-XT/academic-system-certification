package co.com.sofka.runner.hu06;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/hu06/hu06ca001.feature"},
        glue = {"co.com.sofka.stepdefinition.hu06"}
)

public class
HU06CA001Runner {
}
