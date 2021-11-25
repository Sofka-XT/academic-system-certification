package co.com.sofka.userinterfaces.hu005;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CourseInfo extends PageObject {

    public static final Target COURSE_NAME = Target
            .the("Nombre curso")
            .located(xpath(""));

    public static final Target ADD_BUTTON = Target
            .the("Boton agregar")
            .located(xpath(""));

    public static final Target CREATE_BUTTON = Target
            .the("Boton crear")
            .located(xpath(""));

    public static final Target CATEGORY_NAME = Target
            .the("Nombre categoria")
            .located(xpath(""));

    public static final Target TYPE = Target
            .the("Tipo")
            .located(xpath(""));

    public static final Target CONDITION = Target
            .the("Condición")
            .located(xpath(""));

    public static final Target PERCENTAGE = Target
            .the("Porcentaje")
            .located(xpath(""));

    public static final Target FEEDBACK_NAME = Target
            .the("FeedBack name")
            .located(xpath(""));
}
