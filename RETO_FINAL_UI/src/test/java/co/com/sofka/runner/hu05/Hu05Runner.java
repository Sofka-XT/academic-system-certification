
package co.com.sofka.runner.hu05;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/hu05"},
        glue = {"co.com.sofka.stepdefinition.hu05"}

)
public class Hu05Runner {
}
