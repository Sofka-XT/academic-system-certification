package co.com.sofka.userinterfaces.hu07;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.*;

public class CreateTrainingPage extends PageObject {
    public static final Target NAME_TRAINING = Target.the("Nombre del training")
            .located(xpath("//input[@id='form-name']"));

    public static final Target SELECT_COACHES = Target.the("Select Coaches")
            .located(xpath("//select[@id='training__coaches_select']"));

    public static final Target FECHA_INICIO = Target.the("Fecha de Inicio")
            .located(xpath("//input[@id='training__starting-date']"));

    public static final Target UPLOAD_FILE = Target.the("Subir Archivo")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/form/div[4]/div/div/input"));

    public static final Target LIST_PROGRAM = Target.the("Elegir un Programa")
            .located(xpath("//*[@id=\"training\"]/div/div[2]/div[1]/div"));

    public static final Target SUBMIT_TRAINING = Target.the("Crear")
            .located(xpath("/html/body/div/div/div[2]/div/form/div[1]/button"));

    public static final Target BTN_LOGOUT = Target.the("logout")
            .located(xpath("//*[@id=\"logout-link\"]/img\n"));
}
