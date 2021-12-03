package co.com.sofka.userinterfaces.hu005;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

public class CourseDelete extends PageObject {

    public static final Target SEE_COURSE = Target
            .the("ver curso")
            .located(linkText("VER CURSO"));

    public static final Target JAVA_BOTTON = Target
            .the("Botton course java")
            .located(xpath("//button[contains(text(),'Java')]"));

    public static final Target DELETE_BOTTON = Target
            .the("Botton delete")
            .located(xpath("//button[contains(text(),'Eliminar')]"));
    public static final Target CONFIRM_BOTTON = Target
            .the("Botton confirm")
            .located(xpath("//button[contains(text(),'Confirmar')]"));

    public static final Target MESSAJE_DELETED_SUCCESSFUL = Target
            .the("message deleted successful")
            .located(xpath("//div[contains(text(),'El curso se ha eliminado con éxito')]"));
}
