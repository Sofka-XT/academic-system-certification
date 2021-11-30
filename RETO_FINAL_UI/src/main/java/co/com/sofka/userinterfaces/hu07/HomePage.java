package co.com.sofka.userinterfaces.hu07;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.linkText;


public class HomePage extends PageObject {
    public static final Target CREAR_TRAINING = Target.the("create_training")
            .located(linkText("CREAR TRAININ"));


}
