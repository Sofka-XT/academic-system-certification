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

    public static final Target TYPE_RED = Target
            .the("Tipo")
            .located(xpath(""));

    public static final Target CONDITION_RED = Target
            .the("Condición")
            .located(xpath(""));

    public static final Target QUALIFICATION_RED = Target
            .the("Qualification")
            .located(xpath(""));

    public static final Target FEEDBACK_NAME_RED = Target
            .the("FeedBack name")
            .located(xpath(""));


    public static final Target TYPE_YELLOW  = Target
            .the("Tipo")
            .located(xpath(""));

    public static final Target CONDITION_YELLOW = Target
            .the("Condición")
            .located(xpath(""));

    public static final Target QUALIFICATION_YELLOW = Target
            .the("Qualification")
            .located(xpath(""));

    public static final Target FEEDBACK_NAME_YELLOW = Target
            .the("FeedBack name")
            .located(xpath(""));

    public static final Target TYPE_GREEN = Target
            .the("Tipo")
            .located(xpath(""));

    public static final Target CONDITION_GREEN = Target
            .the("Condición")
            .located(xpath(""));

    public static final Target QUALIFICATION_GREEN = Target
            .the("Qualification")
            .located(xpath(""));

    public static final Target FEEDBACK_NAME_GREEN = Target
            .the("FeedBack name")
            .located(xpath(""));
}