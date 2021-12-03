package co.com.sofka.runner.hu12;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src\\test\\resources\\resources\\features\\hu12\\confirmar.feature"},
        glue = {"co\\com\\sofka\\stepdefinition\\hu12"}

)
public class HU12CA001Runner {
}
