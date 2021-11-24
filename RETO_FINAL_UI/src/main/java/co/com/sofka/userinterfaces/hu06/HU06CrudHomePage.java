package co.com.sofka.userinterfaces.hu06;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class HU06CrudHomePage extends PageObject {
    public static final Target SUBMIT_CREATE= Target
            .the("BotónParaIrAcrearPrograma")
            .located(id("  "));

    public static final Target SUBMIT_LIST= Target
            .the("BotónParalistarProgramas")
            .located(id("  "));


}
