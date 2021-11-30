package co.com.sofka.userinterfaces.hu07;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class CreateTrainingPage extends PageObject {
    public static final Target NAME_TRAINING = Target.the("Nombre del training")
            .located(xpath("//input[@id='form-name']"));

    public static final Target SELECT_COACHES = Target.the("Select Coaches")
            .located(xpath("//select[@id='training__coaches_select']"));

    public static final Target FECHA_INICIO = Target.the("Fecha de Inicio")
            .located(xpath("//input[@id='training__starting-date']"));

    public static final Target UPLOAD_FILE = Target.the("Subir Archivo")
            .located(cssSelector("div.dashboard div.container_dashboard div.trainings__main-container form.trainings__form:nth-child(1) div.training__input-form:nth-child(4) div.training__input-container div.training__file-input > div:nth-child(2)"));

    public static final Target LIST_PROGRAM = Target.the("Elegir un Programa")
            .located(xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));

    public static final Target SUBMIT_TRAINING = Target.the("Crear")
            .located(id("submit_training"));

}
