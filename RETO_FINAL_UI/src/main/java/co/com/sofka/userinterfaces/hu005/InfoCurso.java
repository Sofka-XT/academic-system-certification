package co.com.sofka.userinterfaces.hu005;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class InfoCurso extends PageObject {

    public static final Target COURSE_NAME = Target
            .the("Nombre curso")
            .located(xpath(""));
}
