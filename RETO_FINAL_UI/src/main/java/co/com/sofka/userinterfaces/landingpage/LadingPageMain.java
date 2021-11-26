package co.com.sofka.userinterfaces.landingpage;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static org.openqa.selenium.By.xpath;

public class LadingPageMain extends PageObject {

    public static final Target OPCION_TRAINING_ACTIVO = Target
            .the("OPCION_TRAINIG_ACTIVO")
            .located(xpath("//*[@id=\"dashboard\"]/aside/nav/ul/a[1]"));

    public static final Target ASSERTION_TRAINIG_ACTIVO = Target
            .the("ASSERTION_TRAINIG_ACTIVO")
            .located(xpath("//*[@id=\"container_dashboard\"]/h1"));


}
