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
            .located(xpath("//*[@id=\"training__starting-date\"]"));

    public static final Target UPLOAD_FILE = Target.the("Subir Archivo")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div[2]/div/div/input"));

    public static final Target LIST_PROGRAM = Target.the("Elegir un Programa")
            .located(xpath("//*[@id=\"training\"]/div/div[2]/div[1]/div/picture/img"));

    public static final Target SUBMIT_TRAINING = Target.the("Crear")
            .located(xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[5]/button[1]"));

    public static final Target TRAINING_LIST_ACTIVE = Target.the("lista de los trainings")
            .located(xpath("/html/body/div/div/div[2]/div/div"));



}
