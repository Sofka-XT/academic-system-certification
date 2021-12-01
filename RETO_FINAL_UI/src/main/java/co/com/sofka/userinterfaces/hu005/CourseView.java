package co.com.sofka.userinterfaces.hu005;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CourseView extends PageObject {

    public static final Target COURSE_VIEW = Target
            .the("Opción ver curso menú")
            .located(xpath("//body[1]/div[1]/div[1]/aside[1]/nav[1]/ul[1]/a[8]"));

    public static final Target DELETE_BUTTON = Target
            .the("Boton eliminar")
            .located(xpath("//button[contains(text(),'Eliminar')]"));

    public static final Target EDIT_BUTTON = Target
            .the("Boton editar")
            .located(xpath("//button[contains(text(),'Editar')]"));

    public static final Target COURSE_BUTTONS_LIST = Target
            .the("Botones de todos los cursos")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button"));

    public static final Target COURSE_NAME = Target
            .the("Nombre del curso")
            .located(xpath("//header//h2"));

    public static final Target DELETE_CONFIRM = Target
            .the("Boton confirmar eliminacón")
            .located(xpath("//body[1]/div[2]/div[1]/div[4]/div[2]/button[1]"));

    public static final Target CANCEL_DELETE = Target
            .the("Boton cancelar elimición")
            .located(xpath("//body[1]/div[2]/div[1]/div[4]/div[1]/button[1]"));

    public static final Target CATEGORY_NAME = Target
            .the("Nombre categoria")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/h3[1]"));

    public static final Target TYPE_YELLOW = Target
            .the("Tipo alerta amarillo")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[1]"));

    public static final Target CONDITION_YELLOW = Target
            .the("Condición amarillo")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[2]"));

    public static final Target  FEEDBACK_YELLOW = Target
            .the("Fedback amarillo")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[3]"));

    public static final Target  LINK_YELLOW = Target
            .the("Link amarillo")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[3]"));


    public static final Target TYPE_RED= Target
            .the("Tipo alerta roja")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"));

    public static final Target CONDITION_RED= Target
            .the("Condición roja")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/p[2]"));

    public static final Target  FEEDBACK_RED= Target
            .the("Fedback roja")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/p[3]"));

    public static final Target  LINK_RED= Target
            .the("Link roja")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]"));

    public static final Target TYPE_GREEN = Target
            .the("Tipo alerta verde")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/p[1]"));

    public static final Target CONDITION_GREEN = Target
            .the("Condición verde")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/p[1]"));

    public static final Target  FEEDBACK_GREEN = Target
            .the("Fedback verde")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/p[3]"));

    public static final Target  LINK_GREEN = Target
            .the("Link verde")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/a[1]"));





}
