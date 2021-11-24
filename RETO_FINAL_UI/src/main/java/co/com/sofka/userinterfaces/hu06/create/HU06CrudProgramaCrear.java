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
            .located(id("  "));

    public static final Target SelectCourse = Target
            .the("SeleccionarCurso")
            .located(xpath("  "));

    public static final Target SAVE_PROGRAM= Target
            .the("Guardar")
            .located(id(" "));

    //Validate
    public static final Target MESSAGE_VALIDATION= Target
            .the("MensajeDeValidacion")
            .located(id(" "));

    public static final Target MESSAGE_ERROR= Target
            .the("MensajeDeError")
            .located(id(" "));

}
