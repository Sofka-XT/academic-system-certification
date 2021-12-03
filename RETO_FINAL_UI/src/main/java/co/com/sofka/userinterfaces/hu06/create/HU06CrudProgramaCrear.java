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
            .located(name("programName"));

    public static final Target SelectCourse = Target
            .the("SeleccionarCurso")
            .located(cssSelector(".form-select"));

    public static final Target SAVE_PROGRAM= Target
            .the("Guardar")
            .located(xpath("//*[@type=\"submit\"]"));

    public static final Target OK_PROGRAM= Target
            .the("Ok")
            .located(xpath("//*[text()=\"Si, Crealo!\"]"));


    //(//button[@type='button'])[2]

    //Validate

    public static final Target MESSAGE_VALIDATION= Target
            .the("MensajeDeValidacion")
            .located(id("container_dashboard"));

    public static final Target MESSAGE_ERROR= Target
            .the("MensajeDeError")
            .located(id("swal2-title"));

    public static final Target EDICION_DE_PROGRAMA= Target
            .the("edichonDePrograma")
            .located(id("//*[text()=\" Editar Programa \"]"));


}
