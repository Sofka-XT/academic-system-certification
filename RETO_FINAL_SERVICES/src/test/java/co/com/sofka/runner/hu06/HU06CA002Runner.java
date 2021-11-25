package co.com.sofka.runner.hu06;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src\\test\\resources\\resources\\features\\hu06\\listar\\eliminar.feature"},
        glue = {"co\\com\\sofka\\stepdefinition\\hu06"}
)
public class HU06CA002Runner {
}
