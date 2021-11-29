package co.com.sofka.userinterfaces.hu06.create;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class HU06CrudProgramaCrear extends PageObject {


    public static final Target LIST_HOME = Target
            .the("HomeDeListarPrgramas")
            .located(id("  "));

    public static final Target PROGRAM_NAME = Target
            .the("NombreDePrograma")
            .located(name("name"));

    public static final Target SelectCourse = Target
            .the("SeleccionarCurso")
            .located(cssSelector(".form-select"));

    public static final Target SAVE_PROGRAM= Target
            .the("Guardar")
            .located(xpath("//button[@type='submit']"));

    public static final Target OK_PROGRAM= Target
            .the("Ok")
            .located(xpath("//div[6]/button"));


    //(//button[@type='button'])[2]

    //Validate
    public static final Target MESSAGE_VALIDATION= Target
            .the("MensajeDeValidacion")
            .located(id(" "));

    public static final Target MESSAGE_ERROR= Target
            .the("MensajeDeError")
            .located(id(" "));

}
