package co.com.sofka.runner.hu07;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/hu07"},
        glue = {"co.com.sofka.stepdefinition.hu07"}
)
public class HU07Runner {
}
