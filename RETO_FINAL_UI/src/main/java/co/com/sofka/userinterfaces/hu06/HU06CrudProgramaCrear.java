package co.com.sofka.userinterfaces.hu06;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class HU06CrudProgramaCrear extends PageObject {
    public static final Target USER_NAME = Target
            .the("NombreUsuario")
            .located(id("  "));

    public static final Target PROGRAMA = Target
            .the("Programa")
            .located(xpath("  "));
}
