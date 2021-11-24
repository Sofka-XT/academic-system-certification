package co.com.sofka.userinterfaces.landingpage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class LandingPage extends PageObject {

    public static final Target BOTON_LOGIN = Target
            .the("login con google")
            .located(id("button-login-google"));


    public static final Target USERNAME = Target
            .the("Username")
            .located(xpath("//*[@id=\"identifierId\"]"));
}
